import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamFelineTest {
    private final String kind;
    public List<String> expected;
   public ParamFelineTest(String kind, List<String> expected) {
        this.kind = kind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] checkKind() {
        return new Object[][] {
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")}
        };
    }
    @Test
    public void getFoodWithParametrized() throws Exception {
        Feline feline = new Feline();
        assertEquals(expected, feline.getFood(kind));
    }
}
