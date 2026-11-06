package com.klef.soa.event.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.soa.event.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
	List<Event> findByOrganizer(String organizer);
	List<Event> findByVenue(String venue);
	

}
