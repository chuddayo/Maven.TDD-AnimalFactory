package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName() {
        // Given (cat data)
        String givenName = "Bombay";
        Date givenBirthDate = new Date();
        Integer givenId = 2;

        // When (a cat is constructed, and we set a new name)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String newName = "Jazz";
        cat.setName(newName);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newName, retrievedName);
    }
    @Test
    public void testSetName2() {
        // Given (cat data)
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = -45;

        // When (a cat is constructed, and we set a new name)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String newName = "Jennifer";
        cat.setName(newName);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newName, retrievedName);
    }

    @Test
    public void testSpeak() {
        // Given
        String givenName = "Zulu";
        Date givenBirthDate = new Date();
        Integer givenId = 11;

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String expected = "meow!";
        String spoken = cat.speak();

        //Then
        Assert.assertEquals(expected, spoken);
    }
    @Test
    public void testSpeak2() {
        // Given
        String givenName = "Hammer";
        Date givenBirthDate = new Date();
        Integer givenId = 3;

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String expected = "knock knock!";
        String spoken = cat.speak();

        //Then
        Assert.assertNotEquals(expected, spoken);
    }

    @Test
    public void testSetBirthDate() {
        // Given
        String givenName = "Banana";
        Date expected = new Date();
        Integer givenId = 37;

        // When
        Cat cat = new Cat(givenName, null, givenId);
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
