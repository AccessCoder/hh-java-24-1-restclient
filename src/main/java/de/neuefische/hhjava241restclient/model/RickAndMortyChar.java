package de.neuefische.hhjava241restclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RickAndMortyChar {

    private int id;
    private String name;
    private String status;

}
