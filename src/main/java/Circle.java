public class Circle {
    public double r;
    public Circle(double r) {
        this.r = r;
    }

    public double area () {
        return this.r * this.r * Math.PI;
    }

    public double perimeter () {
        return this.r * 2 * Math.PI;
    }
}
