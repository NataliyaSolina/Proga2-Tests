import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAreaRectangle {
    @Test
    public void testAreaRectangle () {
        Rectangle r = new Rectangle(0, 0);
        Assert.assertEquals(r.area(),0);

        for (r.a = 0; r.a < 100; r.a++)
            for (r.b = 0; r.b < 100; r.b++)
                Assert.assertEquals(r.area(), r.a * r.b);
    }
}
