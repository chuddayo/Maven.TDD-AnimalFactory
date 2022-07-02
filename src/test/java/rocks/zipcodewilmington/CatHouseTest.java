package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // DONE - Create tests for `void add(Cat cat)`
    // DONE - Create tests for `void remove(Integer id)`
    // DONE - Create tests for `void remove(Cat cat)`
    // DONE - Create tests for `Cat getCatById(Integer id)`
    // DONE - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(1, actual);
    }

    @Test
    public void addTest() {
        // Given
        String name = "Apple";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertNotEquals(0, actual);
    }

    @Test
    public void addTest2() {
        // Given
        String name = "Orange";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        CatHouse.add(animal);
        CatHouse.add(animal);
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void removeTestByID() {
        // Given
        CatHouse.clear();

        String name1 = "Saucer";
        Date birthDate = new Date();
        Cat animal1 = AnimalFactory.createCat(name1, birthDate);
        CatHouse.add(animal1);

        String name2 = "Flying";
        birthDate = new Date();
        Cat animal2 = AnimalFactory.createCat(name2, birthDate);
        CatHouse.add(animal2);

        String name3 = "UFO";
        birthDate = new Date();
        Cat animal3 = AnimalFactory.createCat(name3, birthDate);
        CatHouse.add(animal3);

        // When
        CatHouse.remove(3);
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(2, actual);
    }

    @Test
    public void removeTestByID2() {
        // Given
        CatHouse.clear();

        String name1 = "Bandit";
        Date birthDate = new Date();
        Cat animal1 = AnimalFactory.createCat(name1, birthDate);
        CatHouse.add(animal1);

        int expected = 1;

        // When
        CatHouse.remove(1);
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void removeTestByCat() {
        // Given
        CatHouse.clear();

        String name1 = "Pen";
        Date birthDate = new Date();
        Cat animal1 = AnimalFactory.createCat(name1, birthDate);
        CatHouse.add(animal1);

        String name2 = "Marker";
        birthDate = new Date();
        Cat animal2 = AnimalFactory.createCat(name2, birthDate);
        CatHouse.add(animal2);

        String name3 = "Laser";
        birthDate = new Date();
        Cat animal3 = AnimalFactory.createCat(name3, birthDate);
        CatHouse.add(animal3);

        int expected = 2;

        // When
        CatHouse.remove(animal1);
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTestByCat2() {
        // Given
        CatHouse.clear();

        String name1 = "Newbie";
        Date birthDate = new Date();
        Cat animal1 = AnimalFactory.createCat(name1, birthDate);
        CatHouse.add(animal1);

        int expected = 0;

        // When
        CatHouse.remove(animal1);
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIDTest() {
        // Given
        CatHouse.clear();

        String name1 = "Pen";
        Date birthDate = new Date();
        Cat animal1 = AnimalFactory.createCat(name1, birthDate);
        CatHouse.add(animal1);

        String name2 = "Marker";
        birthDate = new Date();
        Cat animal2 = AnimalFactory.createCat(name2, birthDate);
        CatHouse.add(animal2);

        String name3 = "Laser";
        birthDate = new Date();
        Cat animal3 = AnimalFactory.createCat(name3, birthDate);
        CatHouse.add(animal3);

        // When
        Cat actual = CatHouse.getCatById(2);

        // Then
        Assert.assertEquals(animal2, actual);
    }
    @Test
    public void getCatByIDTest2() {
        // Given
        CatHouse.clear();

        String name1 = "Pen";
        Date birthDate = new Date();
        Cat animal1 = AnimalFactory.createCat(name1, birthDate);
        CatHouse.add(animal1);

        String name2 = "Marker";
        birthDate = new Date();
        Cat animal2 = AnimalFactory.createCat(name2, birthDate);
        CatHouse.add(animal2);

        String name3 = "Laser";
        birthDate = new Date();
        Cat animal3 = AnimalFactory.createCat(name3, birthDate);
        CatHouse.add(animal3);

        // When
        Cat actual = CatHouse.getCatById(4); // no dog with ID #4

        // Then
        Assert.assertNotEquals(animal2, actual);
    }

    @Test
    public void getNumberOfDogs() {
        // Given
        CatHouse.clear();

        String name1 = "Pen";
        Date birthDate = new Date();
        Cat animal1 = AnimalFactory.createCat(name1, birthDate);
        CatHouse.add(animal1);

        String name2 = "Marker";
        birthDate = new Date();
        Cat animal2 = AnimalFactory.createCat(name2, birthDate);
        CatHouse.add(animal2);

        String name3 = "Laser";
        birthDate = new Date();
        Cat animal3 = AnimalFactory.createCat(name3, birthDate);
        CatHouse.add(animal3);

        // When
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void getNumberOfDogs2() {
        // Given
        CatHouse.clear();

        String name1 = "Pen";
        Date birthDate = new Date();
        Cat animal1 = AnimalFactory.createCat(name1, birthDate);
        CatHouse.add(animal1);

        String name2 = "Marker";
        birthDate = new Date();
        Cat animal2 = AnimalFactory.createCat(name2, birthDate);
        CatHouse.add(animal2);

        String name3 = "Laser";
        birthDate = new Date();
        Cat animal3 = AnimalFactory.createCat(name3, birthDate);
        CatHouse.add(animal3);

        // When
        CatHouse.clear();
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(0, actual);
    }
}
