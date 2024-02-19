package de.neuefische.hhjava241restclient.service;

import de.neuefische.hhjava241restclient.model.RickAndMortyApiResponse;
import de.neuefische.hhjava241restclient.model.RickAndMortyChar;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class RickAndMortyService {

    private RestClient currywurst = RestClient.builder()
            .baseUrl("https://rickandmortyapi.com/api")
            .build();
    public List<RickAndMortyChar> getAllRickAndMortyChars() {
       RickAndMortyApiResponse response = currywurst.get()
                .uri("/character")
                .retrieve()
                .body(RickAndMortyApiResponse.class);
    return response.getResults();
    }

    public RickAndMortyChar getRickAndMortyCharById(String id) {
        RickAndMortyChar response = currywurst.get()
                .uri("/character/"+id)
                .retrieve()
                .body(RickAndMortyChar.class);
        return response;
    }

    public List<RickAndMortyChar> getFilteredRickAndMortyChars(String status) {
        RickAndMortyApiResponse response = currywurst.get()
                .uri("/character/?status="+status)
                .retrieve()
                .body(RickAndMortyApiResponse.class);
        return response.getResults();
    }

    public int getSpeciesStatistics(String species) {
        RickAndMortyApiResponse response = currywurst.get()
                .uri("/character/?status=alive&species="+species)
                .retrieve()
                .body(RickAndMortyApiResponse.class);
        return response.getInfo().getCount();
    }
}
