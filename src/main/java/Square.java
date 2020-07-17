public class Square extends Shape {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Фигура: квадрат, площадь: %.1f кв. ед., "
                + "длина стороны: %.1f ед., цвет: %s", getSquare(), getSide(), getColorTitle()));
    }
}
