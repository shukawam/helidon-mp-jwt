package me.shukawam.example.mp.event;

import me.shukawam.example.mp.event.entity.Event;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Dependent
public class EventService {

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
}
