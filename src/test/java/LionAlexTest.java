import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
public class LionAlexTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensReturnZero() throws Exception {
        LionAlex alex = new LionAlex(feline);
        assertEquals(alex.getKittens(), 0);
    }
    @Test
    public void getCityReturnNewYork() throws Exception {
        LionAlex alex = new LionAlex(feline);
        assertEquals(alex.getCity(), "NewYork");
    }
    @Test
    public void getHobbyReturnList() throws Exception {
        LionAlex alex = new LionAlex(feline);
        assertEquals(alex.getHobby(), List.of("Есть", "Бегать", "Болтать"));
    }
}
