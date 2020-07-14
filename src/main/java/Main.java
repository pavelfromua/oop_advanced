import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    final static Random random = new Random();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[getNumberOfShapes()];

        for (int i = 0; i < shapes.length; i++) {
            switch (getRandomValue(4)) {
                case 1: shapes[i] = new Square(Color.values()[getRandomValue(7)],
                        getRandomValue(100));
                        break;
                case 2: shapes[i] = new Triangle(Color.values()[getRandomValue(7)],
                        getRandomValue(100), getRandomValue(100));
                        break;
                case 3: shapes[i] = new Circle(Color.values()[getRandomValue(7)],
                        getRandomValue(100));
                        break;
                case 4: shapes[i] = new Trapezoid(Color.values()[getRandomValue(7)],
                        getRandomValue(100), getRandomValue(100), getRandomValue(100));
                        break;
            }
        }

        drawShapes(shapes);
    }

    public static void drawShapes(Shape[] shapes) {
        for (Shape shape: shapes) {
            shape.draw();
        }
    }

    private static int getNumberOfShapes() {
        System.out.print("Введите количество фигур: ");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String number = bufferedReader.readLine();

            if (!number.isEmpty()) {
                return Integer.parseInt(number);
            }
        } catch (IOException e) {}

        System.out.print("Количество фигур не указано");

        return 0;
    }

    public static int getRandomValue(int number) {
        return (random.nextInt(number - 1) + 1);
    }
}
