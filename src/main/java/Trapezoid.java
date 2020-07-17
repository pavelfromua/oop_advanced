public class Trapezoid extends Shape {
    private double baseTop;
    private double baseBottom;
    private double height;

    public Trapezoid(Color color, double baseTop, double baseBottom, double height) {
        super(color);
        this.baseTop = baseTop;
        this.baseBottom = baseBottom;
        this.height = height;
    }

    public double getMiddleLine() {
        return (baseTop + baseBottom) / 2;
    }

    @Override
    public double getSquare() {
        return getMiddleLine() * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Фигура: трапеция, площадь: %.1f кв. ед., средняя"
                + " линия: %.1f ед., цвет: %s", getSquare(), getMiddleLine(), getColorTitle()));
    }
}
