import com.codeclan.example.lovedtracklistapp.Track;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24/05/2017.
 */
public class TrackTest {

    Track track;

    @Before
    public void before() {
        track = new Track(1, "Boards of Canada", "Everything You Do Is A Balloon");
    }

    @Test
    public void canGetRank() {
        assertEquals((Integer)1, track.getRank());
    }

    @Test
    public void canGetArtist() {
        assertEquals("Boards of Canada", track.getArtist());
    }

    @Test
    public void canGetTitle() {
        assertEquals("Everything You Do Is A Balloon", track.getTitle());
    }

}