package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.time.Instant;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
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
    public void setNameTest(){
        //given
        Cat cat = new Cat("bob", new Date(), 3);
        String expected = "Lisa";
        //when
        cat.setName("Lisa");
        String actual = cat.getName();
        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setBirthDateTest(){
        //given
        Cat cat = new Cat("bob", new Date(), 3);
        //when
        Date expected = new Date(2000, 11, 11);
        cat.setBirthDate(new Date(2000, 11, 11));
        Date actual = cat.getBirthDate();
        //then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void speakTest(){
        //given
        Cat cat = new Cat("bob", new Date(), 3);
        //when
        
        //then
    }
    @Test
    public void eatTest(){
        //given
        Cat cat = new Cat("bob", new Date(), 3);
        //when
        //then
    }
    @Test
    public void getIdTest(){
        //given
        Cat cat = new Cat("bob", new Date(), 3);
        //when
        //then
    }


}
