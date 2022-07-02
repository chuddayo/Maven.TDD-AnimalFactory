package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // DONE - Create tests for `void add(Dog dog)`
    // DONE - Create tests for `void remove(Integer id)`
    // DONE - Create tests for `void remove(Dog dog)`
    // DONE - Create tests for `Dog getDogById(Integer id)`
    // DONE - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        int expected = 1;
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest() {
        // Given
        String name = "Apple";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        int expected = 0;

        // When
        DogHouse.add(animal);
        int actual = DogHouse.getNumberOfDogs();


        // Then
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void addTest2() {
        // Given
        String name = "Orange";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        int expected = 3;

        // When
        DogHouse.add(animal);
        DogHouse.add(animal);
        DogHouse.add(animal);
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTestByID() {
        // Given
        DogHouse.clear();

        String name1 = "Saucer";
        Date birthDate = new Date();
        Dog animal1 = AnimalFactory.createDog(name1, birthDate);
        DogHouse.add(animal1);

        String name2 = "Flying";
        birthDate = new Date();
        Dog animal2 = AnimalFactory.createDog(name2, birthDate);
        DogHouse.add(animal2);

        String name3 = "UFO";
        birthDate = new Date();
        Dog animal3 = AnimalFactory.createDog(name3, birthDate);
        DogHouse.add(animal3);

        int expected = 2;

        // When
        DogHouse.remove(3);
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTestByID2() {
        // Given
        DogHouse.clear();

        String name1 = "Bandit";
        Date birthDate = new Date();
        Dog animal1 = AnimalFactory.createDog(name1, birthDate);
        DogHouse.add(animal1);

        int expected = 1;

        // When
        DogHouse.remove(1);
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void removeTestByDog() {
        // Given
        DogHouse.clear();

        String name1 = "Pen";
        Date birthDate = new Date();
        Dog animal1 = AnimalFactory.createDog(name1, birthDate);
        DogHouse.add(animal1);

        String name2 = "Marker";
        birthDate = new Date();
        Dog animal2 = AnimalFactory.createDog(name2, birthDate);
        DogHouse.add(animal2);

        String name3 = "Laser";
        birthDate = new Date();
        Dog animal3 = AnimalFactory.createDog(name3, birthDate);
        DogHouse.add(animal3);

        int expected = 2;

        // When
        DogHouse.remove(animal1);
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTestByDog2() {
        // Given
        DogHouse.clear();

        String name1 = "Newbie";
        Date birthDate = new Date();
        Dog animal1 = AnimalFactory.createDog(name1, birthDate);
        DogHouse.add(animal1);

        int expected = 0;

        // When
        DogHouse.remove(animal1);
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIDTest() {
        // Given
        DogHouse.clear();

        String name1 = "Pen";
        Date birthDate = new Date();
        Dog animal1 = AnimalFactory.createDog(name1, birthDate);
        DogHouse.add(animal1);

        String name2 = "Marker";
        birthDate = new Date();
        Dog animal2 = AnimalFactory.createDog(name2, birthDate);
        DogHouse.add(animal2);

        String name3 = "Laser";
        birthDate = new Date();
        Dog animal3 = AnimalFactory.createDog(name3, birthDate);
        DogHouse.add(animal3);

        // When
        Dog actual = DogHouse.getDogById(2);

        // Then
        Assert.assertEquals(animal2, actual);
    }
    @Test
    public void getDogByIDTest2() {
        // Given
        DogHouse.clear();

        String name1 = "Pen";
        Date birthDate = new Date();
        Dog animal1 = AnimalFactory.createDog(name1, birthDate);
        DogHouse.add(animal1);

        String name2 = "Marker";
        birthDate = new Date();
        Dog animal2 = AnimalFactory.createDog(name2, birthDate);
        DogHouse.add(animal2);

        String name3 = "Laser";
        birthDate = new Date();
        Dog animal3 = AnimalFactory.createDog(name3, birthDate);
        DogHouse.add(animal3);

        // When
        Dog actual = DogHouse.getDogById(4); // no dog with ID #4

        // Then
        Assert.assertNotEquals(animal2, actual);
    }

    @Test
    public void getNumberOfDogs() {
        // Given
        DogHouse.clear();

        String name1 = "Pen";
        Date birthDate = new Date();
        Dog animal1 = AnimalFactory.createDog(name1, birthDate);
        DogHouse.add(animal1);

        String name2 = "Marker";
        birthDate = new Date();
        Dog animal2 = AnimalFactory.createDog(name2, birthDate);
        DogHouse.add(animal2);

        String name3 = "Laser";
        birthDate = new Date();
        Dog animal3 = AnimalFactory.createDog(name3, birthDate);
        DogHouse.add(animal3);

        // When
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void getNumberOfDogs2() {
        // Given
        DogHouse.clear();

        String name1 = "Pen";
        Date birthDate = new Date();
        Dog animal1 = AnimalFactory.createDog(name1, birthDate);
        DogHouse.add(animal1);

        String name2 = "Marker";
        birthDate = new Date();
        Dog animal2 = AnimalFactory.createDog(name2, birthDate);
        DogHouse.add(animal2);

        String name3 = "Laser";
        birthDate = new Date();
        Dog animal3 = AnimalFactory.createDog(name3, birthDate);
        DogHouse.add(animal3);

        // When
        DogHouse.clear();
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(0, actual);
    }
}
