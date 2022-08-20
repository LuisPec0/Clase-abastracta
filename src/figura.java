public abstract class figura {

    private String color;

    public figura(String color) { //constructor
        this.color = color;
    }

    public String getColor() { //método getter normal  no es abstracto
        return color;
    }
    public abstract  double calcularArea();
}
