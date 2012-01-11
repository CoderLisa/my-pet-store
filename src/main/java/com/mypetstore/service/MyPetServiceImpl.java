package com.mypetstore.service;


import com.mypetstore.domain.Pet;

import java.util.ArrayList;
import java.util.List;

public class MyPetServiceImpl implements MyPetService {

    private List<Pet> pets = new ArrayList<Pet>();

    public List<Pet> getPets() {
        return pets;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }
}
