	package com.klef.soa.event.service;
import java.util.List;

import com.klef.soa.event.entity.Event;

public interface EventService
{
	 	Event addEvent(Event e);
	    Event updateEvent(Event e);
	    void deleteEvent(Long eventId);
	    List<Event> displayAllEvents();
	    Event displayEventById(Long eventId);
	    List<Event> displayByOrganizer(String organizer);
	    List<Event> displayByVenue(String venue);
}
