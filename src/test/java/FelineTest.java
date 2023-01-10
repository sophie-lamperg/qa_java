import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void getFamilyReturnFeline() {
        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }
    @Test
    public void getKittensWithSecondParametersReturnSecond () {
        int actual = feline.getKittens(2);
        assertEquals(2, actual);
    }
    @Test
    public void getKittensWithoutParametersReturnOne () {
        int actual = feline.getKittens();
        assertEquals(1, actual);
    }

    @Test
    public void getFoodForPredatorReturnList() throws Exception {
        List actual = feline.getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }
    @Test
    public void getFoodForHerbivorousReturnList() throws Exception {
        List actual = feline.getFood("Травоядное");
        assertEquals(List.of("Трава", "Различные растения"), actual);
    }
}
