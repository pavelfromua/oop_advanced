public enum Color {
    RED("Красный"),
    ORANGE("Оранжевый"),
    YELLOW("Желтый"),
    GREEN("Зеленый"),
    BLUE("Голубой"),
    DARKBLUE("Синий"),
    VIOLET("Фиолетовый");


    private String title;

    Color(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
