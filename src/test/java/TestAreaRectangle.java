import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAreaRectangle {
    @Test
    public void testAreaRectangle () {
        Rectangle r = new Rectangle(0, 0);
        Assert.assertEquals(r.area(),40);


    }
}
