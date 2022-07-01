package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Fido";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTestDog() {
        // Given (dog data)
        String givenName = "Luna";
        Date givenBirthDate = new Date();
        Integer givenId = 2;

        // When (a dog is constructed, and we set a new name)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String newName = "Jasper";
        dog.setName(newName);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newName, retrievedName);
    }
    @Test
    public void setNameTestDog2() {
        // Given (dog data)
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = -45;

        // When (a dog is constructed, and we set a new name)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String newName = "Ringo";
        dog.setName(newName);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newName, retrievedName);
    }

    @Test
    public void speakTest() {
        // Given
        String givenName = "Zulu";
        Date givenBirthDate = new Date();
        Integer givenId = 11;

        // When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String expected = "bark!";
        String spoken = dog.speak();

        //Then
        Assert.assertEquals(expected, spoken);
    }
    @Test
    public void speakTest2() {
        // Given
        String givenName = "Bow Wow";
        Date givenBirthDate = new Date();
        Integer givenId = 3;

        // When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String expected = "knock knock!";
        String spoken = dog.speak();

        //Then
        Assert.assertNotEquals(expected, spoken);
    }

    @Test
    public void setBirthDateTest() {
        // Given
        String givenName = "Image";
        Date expected = new Date();
        Integer givenId = 37;

        // When
        Dog dog = new Dog(givenName, null, givenId);
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        // Given
        String givenName = "Hippo";
        Date givenDate = new Date();
        Integer givenId = 427;
        Integer expected = 1;

        // When
        Dog dog = new Dog(givenName, givenDate, givenId);
        Food kibble = new Food();
        dog.eat(kibble);
        Integer actual = dog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest2() {
        // Given
        String givenName = "Sade";
        Date givenDate = new Date();
        Integer givenId = 9;
        Integer expected = 3;

        // When
        Dog dog = new Dog(givenName, givenDate, givenId);
        Food kibble = new Food();
        Food packet = new Food();
        Food dogCookie = new Food();
        dog.eat(kibble);
        dog.eat(packet);
        dog.eat(dogCookie);
        Integer actual = dog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest3() {
        // Given
        String givenName = "Cow";
        Date givenDate = new Date();
        Integer givenId = 99;
        Integer expected = 3;

        // When
        Dog dog = new Dog(givenName, givenDate, givenId);
        Food kibble = new Food();
        dog.eat(kibble);
        dog.eat(kibble);
        dog.eat(kibble);
        Integer actual = dog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIDTest() {
        // Given
        String givenName = "PTO";
        Date givenDate = new Date();
        Integer expected = 99;

        // When
        Dog dog = new Dog(givenName, givenDate, expected);
        Integer actual = dog.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIDTest2() {
        // Given
        String givenName = "PTO";
        Date givenDate = new Date();
        Integer expected = -3;

        // When
        Dog dog = new Dog(givenName, givenDate, expected);
        Integer actual = dog.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void instanceOfMammalTest() {
        // Given
        String givenName = "PTO";
        Date givenDate = new Date();
        Integer givenID = 123;
        boolean expected = true;

        // When
        Dog dog = new Dog(givenName, givenDate, givenID);
        boolean actual = dog instanceof Mammal;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void instanceOfAnimalTest() {
        // Given
        String givenName = "Sugar";
        Date givenDate = new Date();
        Integer givenID = 44;
        boolean expected = true;

        // When
        Dog dog = new Dog(givenName, givenDate, givenID);
        boolean actual = dog instanceof Animal;

        // Then
        Assert.assertEquals(expected, actual);
    }
}
