import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void getMaximumSize_teamInstantiatesWithTeam_4() {
        Squad testSquad = new Squad("NinjaSquad", 4, "computer illiteracy");
        assertEquals("NinjaSquad", testSquad.getMaximumSize());
    }

    @Test
    public void getReason_teamInstantiatesWithTeam_computerIlliteracy() {
        Squad testSquad = new Squad("NinjaSquad", 4, "computer illiteracy");
        assertEquals("computer illiteracy", testSquad.getReason());
    }
}
