	package com.klef.soa.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.klef.soa.event.entity.Event;
import com.klef.soa.event.service.EventService;

@RestController
@RequestMapping("/event")
public class EventController
{
    @Autowired
    private EventService eventService;

    @GetMapping("/")
    public String home()
    {
        return "Event Demo Project";
    }

    @PostMapping("/add")
    public Event addEvent(@RequestBody Event e)
    {
        return eventService.addEvent(e);
    }

    @PutMapping("/update")
    public Event updateEvent(@RequestBody Event e)
    {
        return eventService.updateEvent(e);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEvent(@PathVariable Long id)
    {
        eventService.deleteEvent(id);
        return "Event Deleted Successfully";
    }

    @GetMapping("/displayall")
    public List<Event> displayAllEvents()
    {
        return eventService.displayAllEvents();
    }

    @GetMapping("/display/{id}")
    public Event displayEventById(@PathVariable Long id)
    {
        return eventService.displayEventById(id);
    }
    @GetMapping("/organizer/{organizer}")
    public List<Event> displayByOrganizer(@PathVariable String organizer)
    {
        return eventService.displayByOrganizer(organizer);
    }

    @GetMapping("/venue/{venue}")
    public List<Event> displayByVenue(@PathVariable String venue)
    {
        return eventService.displayByVenue(venue);
    }
}