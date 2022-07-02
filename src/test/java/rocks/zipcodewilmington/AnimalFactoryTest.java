package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.*;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.*;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    // DONE - Create Test for `Animal createDog(String name, Date birthDate)`
    // DONE - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        // Given
        DogHouse.clear();

        String name = "Shook";
        Date givenDate = new Date();
        Dog animal = AnimalFactory.createDog(name, givenDate);
        DogHouse.add(animal);

        // When
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void createDogTest2() {
        // Given
        DogHouse.clear();

        String name = "Shake";
        Date givenDate = new Date();
        Dog animal = AnimalFactory.createDog(name, givenDate);
        DogHouse.add(animal);

        String name2 = "Shook";
        Date givenDate2 = new Date();
        Dog animal2 = AnimalFactory.createDog(name2, givenDate2);
        DogHouse.add(animal2);

        // When
        DogHouse.remove(animal);
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(1, actual);
    }
    @Test
    public void createCatTest() {
        // Given
        CatHouse.clear();

        String name = "Shook";
        Date givenDate = new Date();
        Cat animal = AnimalFactory.createCat(name, givenDate);
        CatHouse.add(animal);

        // When
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(1, actual);
    }
    @Test
    public void createCatTest2() {
        // Given
        CatHouse.clear();

        String name = "Shake";
        Date givenDate = new Date();
        Cat animal = AnimalFactory.createCat(name, givenDate);
        CatHouse.add(animal);

        String name2 = "Shook";
        Date givenDate2 = new Date();
        Cat animal2 = AnimalFactory.createCat(name2, givenDate2);
        CatHouse.add(animal2);

        // When
        CatHouse.remove(animal);
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(1, actual);
    }
}
