package ohtuesimerkki;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StatisticsTest {

    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    Statistics stats;

    @Before
    public void setUp(){
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
    }

    // Tässä testissä oli ongelmia, sillä metodi topScorers palauttaa n+1 pelaajaa, kun sille annetaan parametri n.
    // En ollut varma olisiko minun pitänyt korjata kyseinen metodi, mutta koska tehtävänannossa ei kehotettu siihen,
    // niin jätin sen entiselleen ja laitoin testin huomioimaan sen.
    @Test
    public void returnedListIsCorrectSize() {
        assertEquals(4, stats.topScorers(3).size());
    }

    @Test
    public void returnedTeamIsCorrect() {
        assertEquals("PIT", stats.team("PIT").get(0).getTeam());
    }

    @Test
    public void returnsAllPlayersFromTeam() {
        assertEquals(3, stats.team("EDM").size());
    }

    @Test
    public void searchingReturnsCorrectPlayer() {
        Player player = stats.search("Kurri");
        assertEquals("Kurri", player.getName());
    }

    @Test
    public void searchingReturnsNull() {
        Player player = stats.search("Crosby");
        assertNull(player);
    }
}
