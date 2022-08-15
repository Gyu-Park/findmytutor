package com.project.findmytutor.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.findmytutor.model.Tutor;
import com.project.findmytutor.repository.TutorRepository;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/api/tutor")
@AllArgsConstructor
public class TutorController {

    private final TutorRepository tutorRepository;

    @QueryMapping
    Iterable<Tutor> tutors() {
        return tutorRepository.findAll();
    }
    
}
