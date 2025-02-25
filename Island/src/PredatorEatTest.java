import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PredatorEatTest {

    @Test
    public void testPredatorEat() {
        Location location = new Location();
        Animal predator = new Wolf();
        Animal prey = new Rabbit();

        location.addAnimal(predator);
        location.addAnimal(prey);

        predator.eat(location);

        assertEquals(1, location.getAnimals().size(), "Predator should eat the prey");
    }
}