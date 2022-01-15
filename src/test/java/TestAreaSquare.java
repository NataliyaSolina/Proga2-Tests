import org.testng.Assert;
import org.testng.annotations.Test;


public class TestAreaSquare {

    @Test
    public void testAreaSquare () {
        Square s = new Square(0);
        Assert.assertEquals(s.area(), 0);

        for (; s.l < 100; s.l++)
            Assert.assertEquals(s.area(), s.l * s.l);
    }

}
