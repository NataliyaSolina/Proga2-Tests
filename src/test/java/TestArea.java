import org.testng.Assert;
import org.testng.annotations.Test;


public class TestArea {

    @Test
    public void testAreaSquare () {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25);
    }
    @Test
    public void testAreaRectangle () {
        Rectangle r = new Rectangle(5, 8);
        Assert.assertEquals(r.area(),40);
    }
}
