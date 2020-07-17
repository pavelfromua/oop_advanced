public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getColorTitle() {
        return color.getTitle();
    }

    public abstract double getSquare();

    public void draw() {
        System.out.println("Noname shape with color :" + getColorTitle());
    }
}
