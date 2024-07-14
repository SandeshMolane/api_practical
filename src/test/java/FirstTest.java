import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void runFirst() {
        int num1 = 1;
        int num2 = 3;

        Assert.assertEquals(num1+num2, 4);
    }
}
