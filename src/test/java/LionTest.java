import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
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
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }
    @Test
    public void getKittensReturnKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(0, lion.getKittens());
    }
    @Test
    public void getdoesHaveManeReturnTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(true, lion.doesHaveMane());
    }
    @Test
    public void getdoesHaveManeReturnFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertEquals(false, lion.doesHaveMane());
    }
    @Test
    public void lionsEatPredatorFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }
}
