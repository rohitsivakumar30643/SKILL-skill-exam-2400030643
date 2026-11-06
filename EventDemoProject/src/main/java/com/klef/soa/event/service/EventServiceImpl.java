package com.klef.soa.event.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.event.entity.Event;
import com.klef.soa.event.repository.EventRepository;
@Service
public  class EventServiceImpl implements EventService 
{
	@Autowired
	private EventRepository eventRepository;

	@Override
	public Event addEvent(Event e) {
		
		return eventRepository.save(e);
	}

	@Override
	public Event updateEvent(Event e) {
		 Optional<Event> optional = eventRepository.findById(e.getEventId());

		    if(optional.isPresent())
		    {
		        Event event = optional.get();

		        event.setEventName(e.getEventName());
		        event.setOrganizer(e.getOrganizer());
		        event.setVenue(e.getVenue());
		        event.setEventDate(e.getEventDate());
		        event.setTicketPrice(e.getTicketPrice());

		        return eventRepository.save(event);
		    }
		    else
		    {
		        return null;
		    }
	}

	@Override
	public void deleteEvent(Long eventId) {
		eventRepository.deleteById(eventId );
		
	}

	@Override
	public List<Event> displayAllEvents() {
	    return eventRepository.findAll();
	}
	
	@Override
	public Event displayEventById(Long eventId) {
		return eventRepository.findById(eventId).orElse(null);
	}

	@Override
	public List<Event> displayByOrganizer(String organizer)
	{
	    return eventRepository.findByOrganizer(organizer);
	}

	@Override
	public List<Event> displayByVenue(String venue)
	{
	    return eventRepository.findByVenue(venue);
	}
	
}

