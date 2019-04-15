import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SquadTest {

    @Test
    public void Squad_instantiatesCorrectly_true() {
        Squad testSquad = new Squad("Xmen", 4, "computer illiteracy");
        assertTrue(testSquad instanceof Squad);
    }

    @Test
    public void getName_teamInstantiatesWith_Xmen() {
        Squad testSquad = new Squad("Xmen", 4, "computer illiteracy");
        assertEquals("Xmen", testSquad.getName());
    }

    @Test
    public void getMaximumSize_teamInstantiatesWithTeam_4() {
        Squad testSquad = new Squad("Xmen", 4, "computer illiteracy");
        assertEquals(4, testSquad.getMaximumSize());
    }

    @Test
    public void getReason_teamInstantiatesWithTeam_computerIlliteracy() {
        Squad testSquad = new Squad("Xmen", 4, "computer illiteracy");
        assertEquals("computer illiteracy", testSquad.getReason());
    }

    @Test
    public void all_returnsAllInstancesofSquad_True() {
        Squad testSquadTwo = new Squad("Inhumans", 5, "computer illiteracy");
        assertEquals(true, Squad.all().contains(testSquadTwo));

    }


    @Test
    public void clear_emptiesAllSquadsFromList_0() {
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }


    @Test
    public void getId_squadInstantiatesWithAnId_1() {
        Squad testSquad = new Squad("Xmen", 4, "computer illiteracy");
        assertEquals(0, testSquad.getId());
    }

    @Test
    public void find_returnsSquadWithSameId_testSquadTwo() {
        Squad testSquadTwo = new Squad("Inhumans", 5, "computer illiteracy");
        assertEquals(Squad.find(testSquadTwo.getId()), testSquadTwo);
    }

    @Test
    public void getHeroes_initiallyReturnsEmptyList_ArrayList() {
        Squad testSquad = new Squad("Xmen", 4, "computer illiteracy");
        assertEquals(0, testSquad.getHeroes().size());
    }

}
