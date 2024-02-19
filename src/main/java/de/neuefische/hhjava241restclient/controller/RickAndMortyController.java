package de.neuefische.hhjava241restclient.controller;

import de.neuefische.hhjava241restclient.model.RickAndMortyApiResponse;
import de.neuefische.hhjava241restclient.service.RickAndMortyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rick")
@RequiredArgsConstructor
public class RickAndMortyController {

    private final RickAndMortyService service;

    @GetMapping
    public RickAndMortyApiResponse getAllRickAndMortyChars(){
        return service.getAllRickAndMortyChars();
    }

}
