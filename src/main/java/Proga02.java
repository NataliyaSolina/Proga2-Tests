public class Proga02 {
    public static void main(String[] args) {
        Square sq = new Square(7);
        System.out.println("Площадь квадрата со стороной " + sq.l + " = " + sq.area());

        Rectangle rc = new Rectangle(6, 9);
        System.out.println("Площадь прямоугольника со сторонами " + rc.a + " и " + rc.b + " = " + rc.area());

    }
}
