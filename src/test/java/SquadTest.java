import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void Squad_instantiatesCorrectly_true() {
        Squad testSquad = new Squad("NinjaSquad", 4, "computer illiteracy");
        assertTrue(testSquad instanceof Squad);
    }

    @Test
    public void getName_teamInstantiatesWith_NinjaSquad() {
        Squad testSquad = new Squad("NinjaSquad", 4, "computer illiteracy");
        assertEquals("NinjaSquad", testSquad.getName());
    }
}
