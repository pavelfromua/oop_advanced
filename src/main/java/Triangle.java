public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(Color color, double height, double base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    public double getHypotenuse() {
        return Math.sqrt(height * height + base * base);
    }

    @Override
    public double getSquare() {
        return height * base / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Фигура: треугольник, площадь: %.1f кв. ед., "
                        + "длина гипотенузы: %.1f ед., цвет: %s", getSquare(), getHypotenuse(),
                getColorTitle()));
    }
}
