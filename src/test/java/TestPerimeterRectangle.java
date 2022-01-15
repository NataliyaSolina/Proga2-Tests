import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPerimeterRectangle {
    @Test
    public void testPerimeterRectangle () {
        Rectangle r = new Rectangle( 0, 0);
        Assert.assertEquals(r.perimeter(), 0);

        for (r.a = 0; r.a < 100; r.a++)
            for (r.b = 0; r.b < 100; r.b++)
                Assert.assertEquals(r.perimeter(), (r.a + r.b) * 2);
    }
}
