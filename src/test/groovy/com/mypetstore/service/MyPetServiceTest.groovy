import com.mypetstore.domain.Pet
import com.mypetstore.service.MyPetService
import com.mypetstore.service.MyPetServiceImpl
import spock.lang.Specification

class MyPetServiceTest extends Specification {

    def MyPetService myPetService
    def Pet dog
    def Pet cat
    def Pet hamster

    def setup() {
        myPetService = new MyPetServiceImpl()
        dog = createNewPet("dog", 650.00, 200.00)
        cat = createNewPet("cat", 125.00, 25.00)
        hamster = createNewPet("hamster", 15.00, 2.00)
    }

    Pet createNewPet(String type, Float price, Float cost) {
        Pet pet = new Pet()
        pet.type = type
        pet.setPrice(price)
        pet.setCost(cost)
    }

    def "add pets and get list of pets"() {
        given:
        myPetService.addPet(dog)
        myPetService.addPet(cat)

        when:
        def pets = myPetService.getPets()

        then:
        pets.size() == 2
        pets.contains(dog)
        pets.contains(cat)
    }


}