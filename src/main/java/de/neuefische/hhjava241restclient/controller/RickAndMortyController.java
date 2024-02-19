package de.neuefische.hhjava241restclient.controller;

import de.neuefische.hhjava241restclient.model.RickAndMortyApiResponse;
import de.neuefische.hhjava241restclient.model.RickAndMortyChar;
import de.neuefische.hhjava241restclient.service.RickAndMortyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rick")
@RequiredArgsConstructor
public class RickAndMortyController {

    private final RickAndMortyService service;

    @GetMapping("/")
    public List<RickAndMortyChar> getAllRickAndMortyChars(){
        return service.getAllRickAndMortyChars();
    }

    @GetMapping("/{id}")
    public RickAndMortyChar getRickAndMortyCharById(@PathVariable String id){
        return service.getRickAndMortyCharById(id);
    }

    @GetMapping()
    public List<RickAndMortyChar> getFilteredRickAndMortyChars(@RequestParam String status){
        return service.getFilteredRickAndMortyChars(status);
    }

    @GetMapping("/species-statistic")
    public int getSpeciesStatistics(@RequestParam String species){
        return service.getSpeciesStatistics(species);
    }

}
