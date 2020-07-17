public class Circle extends Shape {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Фигура: круг, площадь: %.1f кв. ед., "
                + "радиус: %.1f ед., цвет: %s", getSquare(), getRadius(), getColorTitle()));
    }
}
