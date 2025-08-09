import org.junit.Test;
import static org.junit.Assert.*;

public class TestZoo {

    @Test
    public void testAddAnimal() {
        Zoo zoo = new Zoo();
        Animal animal = new Animal("Leu", "Simba");
        assertTrue(zoo.addAnimal(animal));
    }

    @Test
    public void testRemoveAnimal() {
        Zoo zoo = new Zoo();
        Animal animal = new Animal("Leu", "Simba");
        zoo.addAnimal(animal);
        assertTrue(zoo.removeAnimal(animal));
    }

    @Test
    public void testAreAnimalsInZoo() {
        Zoo zoo = new Zoo();
        assertFalse(zoo.areAnimals());
    }

    @Test
    public void testGetAnimals() {
        Zoo zoo = new Zoo();
        Animal animal1 = new Animal("Leu", "Simba");
        Animal animal2 = new Animal("Elefant", "Dumbo");
        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        assertEquals(2, zoo.size());
    }
}