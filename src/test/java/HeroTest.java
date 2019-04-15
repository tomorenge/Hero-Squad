import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HeroTest {
    @Test
    public void Hero_instantiatesCorrectly_true() {
        Hero testHero = new Hero("Maximus", 30, "Strength, speed", "cannot run");
        assertTrue(testHero instanceof Hero);
    }

    @Test
    public void getName_returnsName_Maximus() {
        Hero testHero = new Hero("Maximus", 30, "Strength, speed", "cannot run");
        assertEquals("Maximus", testHero.getName());
    }

    @Test
    public void getAbility_returnsAbility_Strength() {
        Hero testHero = new Hero("Maximus", 30, "Strength, speed", "cannot run");
        assertEquals("Strength, speed", testHero.getAbility());
    }

    @Test
    public void getAge_returnsAge_30() {
        Hero testHero = new Hero("Maximus", 30, "Strength, speed", "cannot run");
        assertEquals(30, testHero.getAge());
    }

    @Test
    public void getWeakness_returnsAbility_CannotRun() {
        Hero testHero = new Hero("Maximus", 30, "Strength, speed", "cannot run");
        assertEquals("cannot run", testHero.getWeakness());
    }


    @Test
    public void all_returnsAllInstancesOfHero_true() {
        Hero anotherHero = new Hero("Commando", 35, "Fighter, use machinegun", "getting old");
        assertTrue(Hero.all().contains(anotherHero));
    }


    @Test
    public void clear_emptiesAllHerosFromList_0() {
        Hero.clear();
        assertEquals(0, Hero.all().size());
    }

    @Test
    public void getId_returnsInstantiateWithAnId_1() {
        Hero.clear();
        Hero testHero = new Hero("Maximus", 30, "Strength, speed", "cannot run");
        assertEquals(1, testHero.getId());
    }

    @Test
    public void find_returnsHeroWithSameId_AnotherHero() {
        Hero anotherHero = new Hero("Maximus", 31, "Strength, speed", "cannot run");
        assertEquals(anotherHero, Hero.find(anotherHero.getId()));
    }

}
