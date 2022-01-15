import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPerimeterSquare {

    @Test
    public void testPerimeterSquare () {
        Square s = new Square(0);
        Assert.assertEquals(s.perimeter(), 0);

        for (; s.l < 100; s.l++)
            Assert.assertEquals(s.perimeter(), s.l * 4);
    }
}
