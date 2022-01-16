import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPerimeterCircle {
    @Test
    public void testPerimeterCircle () {
        Circle c = new Circle(0);
        Assert.assertEquals(c.perimeter(), 0);

        for (; c.r < 100; c.r++)
            Assert.assertEquals(c.perimeter(), c.r * 2 * Math.PI);
    }
}
