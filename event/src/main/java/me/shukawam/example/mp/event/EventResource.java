package me.shukawam.example.mp.event;

import me.shukawam.example.mp.event.entity.Event;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("event")
public class EventResource {

    private final EventService eventService;

    @Inject
    public EventResource(EventService eventService) {
        this.eventService = eventService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Event> getAllEvent() {
        return eventService.getAllEvent();
    }

    @GET
    @Path("id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Event getEventById(@PathParam("id") Integer id) {
        return eventService.getEventById(id);
    }

    @GET
    @Path("title/{title}")
    public Event getEventByTitle(@PathParam("title") String title) {
        return eventService.getEventByTitle(title);
    }

    @GET
    @Path("season/{season}")
    public List<Event> getEventBySeason(@PathParam("season") String season) {
        return eventService.getEventBySeason(season);
    }
}
