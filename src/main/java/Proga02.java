import java.sql.SQLOutput;

public class Proga02 {
    public static void main(String[] args) {
        Square sq = new Square(7);
        System.out.println("Площадь квадрата со стороной " + sq.l + " = " + sq.area());
        System.out.println("Периметр квадрата со стороной " + sq.l + " = " + sq.perimeter());

        Rectangle rc = new Rectangle(6, 7);
        System.out.println("Площадь прямоугольника со сторонами " + rc.a + " и " + rc.b + " = " + rc.area());
        System.out.println("Периметр прямоугольника со сторонами " + rc.a + " и " + rc.b + " = " + rc.perimeter());

        Circle cl = new Circle(5);
        System.out.println("Площадь круга с радиусом " + cl.r + " = " + cl.area());
        System.out.println("Периметр круга с радиусом " + cl.r + " = " + cl.perimeter());

        int a = 17;
        int b = 5;
        float c0 = 1;
        int c1 = a / b;
        float c2 = 17f / 5f;
        float c3 = a / b;
        float c4 = (float) a / (float) b;
        float c5 = (float) (a / b);
        System.out.println("a= " + a + " b= " + b + " c0= " +c0 + " c1= " + c1 + " c2= " + c2 + " c3= " + c3 + " c4= " + c4 + " c5= " + c5);

        System.out.println(c0 == 0? "c0 = 0 " : "c0 != 0");
    }
}
