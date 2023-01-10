import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundReturnMeow() {
        Cat cat = new Cat(feline);

        String actual = cat.getSound();
        assertEquals("Мяу", actual);
    }
    @Test
    public void getFoodReturnListFood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, cat.getFood());
    }
}
