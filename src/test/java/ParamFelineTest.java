import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamFelineTest {
    private final String kind;

   public ParamFelineTest(String kind) {
        this.kind = kind;
    }

    @Parameterized.Parameters
    public static Object[] checkKind() {
        return new Object[] {
                "Хищник",
                "Травоядное",
                "Опоссум",
                null
        };
    }
    @Test
    public void getFoodWithParametrized() throws Exception {
        Feline feline1 = new Feline();
        feline1.getFood(kind);
    }
}
