import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void getFamilyReturnFeline() {
        String actual = feline.getFamily();
        assertEquals(actual, "Кошачьи");
    }
    @Test
    public void getKittensWithSecondParametersReturnSecond () {
        int actual = feline.getKittens(2);
        assertEquals(actual, 2);
    }
    @Test
    public void getKittensWithoutParametersReturnOne () {
        int actual = feline.getKittens();
        assertEquals(actual, 1);
    }

    @Test
    public void getFoodForPredatorReturnList() throws Exception {
        List actual = feline.getFood("Хищник");
        assertEquals(actual, List.of("Животные", "Птицы", "Рыба"));
    }
    @Test
    public void getFoodForHerbivorousReturnList() throws Exception {
        List actual = feline.getFood("Травоядное");
        assertEquals(actual, List.of("Трава", "Различные растения"));
    }
}
