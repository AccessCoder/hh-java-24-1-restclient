package de.neuefische.hhjava241restclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RickAndMortyApiResponse {

    RickAndMortyInfo info;
    List<RickAndMortyChar> results;
}
