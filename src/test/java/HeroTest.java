import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void Hero_instantiatesCorrectly_true() {
        Hero testHero = new Hero("NinjaMan", 30, "Strength, speed", "cannot run");
        assertTrue(testHero instanceof Hero);
    }

    @Test
    public void getName_returnsName_NinjaMan() {
        Hero testHero = new Hero("NinjaMan", 30, "Strength, speed", "cannot run");
        assertEquals("NinjaMan", testHero.getName());
    }

    @Test
    public void getAbility_returnsAbility_Strength() {
        Hero testHero = new Hero("NinjaMan", 30, "Strength, speed", "cannot run");
        assertEquals("Strength, speed", testHero.getAbility());
    }

    @Test
    public void getAge_returnsAge_30() {
        Hero testHero = new Hero("NinjaMan", 30, "Strength, speed", "cannot run");
        assertEquals(30, testHero.getAge());
    }

    @Test
    public void getWeakness_returnsAbility_CannotRun() {
        Hero testHero = new Hero("NinjaMan", 30, "Strength, speed", "cannot run");
        assertEquals("cannot run", testHero.getWeakness());
    }
}
