package com.mypetstore.service;


import com.mypetstore.domain.Pet;

import java.util.List;

public interface MyPetService {

    List<Pet> getPets();

    void addPet(Pet pet);

}
