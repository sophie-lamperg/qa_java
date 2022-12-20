import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getFoodReturnList() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }
    @Test
    public void getKittensReturnKittens() {
        Lion lion = new Lion(feline);
        assertEquals(lion.getKittens(), 0);
    }
    @Test
    public void getdoesHaveManeReturnTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(lion.doesHaveMane(), true);
    }
    @Test
    public void getdoesHaveManeReturnFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertEquals(lion.doesHaveMane(), false);
    }
}
