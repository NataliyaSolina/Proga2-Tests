import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAreaCircle {
    @Test
    public void testAreaCircle () {
        Circle c = new Circle(0);
        Assert.assertEquals(c.area(), 0);

       for (; c.r < 100; c.r++)
           Assert.assertEquals(c.area(), c.r * c.r * Math.PI);
    }
}
