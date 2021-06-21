package me.shukawam.example.mp.event;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Logger;

@Dependent
public class EventService {
    private static final Logger LOGGER = Logger.getLogger(Event.class.getName());
    @PersistenceContext(unitName = "AtpDataSource")
    private EntityManager entityManager;

    public List<Event> getAllEvent() {
        return entityManager.createNamedQuery("getAllEvent", Event.class).getResultList();
    }

    public Event getEventById(Integer id) {
        var event = entityManager.find(Event.class, id);
        if (event == null) {
            // do something.
        }
        return event;
    }

    public Event getEventByTitle(String title) {
        var event = entityManager.createNamedQuery("getEventByTitle", Event.class)
                .setParameter("title", title)
                .getSingleResult();
        if (event == null) {
            // do something.
        }
        return event;
    }

    public List<Event> getEventBySeason(String season) {
        return entityManager.createNamedQuery("getEventBySeason", Event.class)
                .setParameter("season", season)
                .getResultList();
    }

    @Transactional
    public Event createEvent(CreateEventRequest createEventRequest) {
        var event = newEvent(createEventRequest);
        entityManager.persist(event);
        return event;
    }

    @Transactional
    public void deleteEvent(Integer id) {
        var event = entityManager.find(Event.class, id);
        if(event == null) {
            throw new RuntimeException("Event is NOT found.");
        }
        entityManager.remove(event);
    }

    private Event newEvent(CreateEventRequest createEventRequest) {
        var events = entityManager.createNamedQuery("getLatestEvent", Event.class)
                .getResultList();
        if (events.isEmpty()) {
            throw new RuntimeException("Event is NULL");
        }
        var latestEvent = events.get(0);
        if (latestEvent == null) {
            throw new RuntimeException("Event is NULL");
        }
        try {
            var event = new Event();
            event.setId(latestEvent.getId() + 1000);
            event.setTitle(createEventRequest.getTitle());
            event.setSeason(createEventRequest.getSeason());
            event.setPresenter(createEventRequest.getPresenter());
            event.setEventDate(new Date(new SimpleDateFormat("yyyy-mm-dd").parse(createEventRequest.getEventDate()).getTime()));
            return event;
        } catch (ParseException e) {
            throw new RuntimeException("Date format is wrong!");
        }
    }
}
