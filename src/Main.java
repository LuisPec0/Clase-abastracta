import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String color;
        double lado;
        double base = 0;
        double altura = 0;

        Scanner x = new Scanner(System.in);
        System.out.println("Ingresar el color del cuadrado");
        color=x.next();
        System.out.println("ingrese el lado del cuadrado: ");
        lado=x.nextDouble();

        cuadrado c1 = new cuadrado(color,lado);
        System.out.println(("el area del Cuadrado es: "+c1.calcularArea()));
        System.out.println("El color del cuadrado 1 es: " +c1.getColor());

        cuadrado c2 = new cuadrado("Azul",2.5);
        System.out.println("El color del cuadrado 2 es: "+c2.getColor());
        System.out.println(("el area del Cuadrado 2 es: "+c2.calcularArea()));

        triangulo triangulo1 = new triangulo(color, base, altura);
        Scanner t = new Scanner(System.in);
        System.out.println("ingresar el color del Tringualo: ");
        color = t.next();
        System.out.println("Ingresar la base del tringualo: ");
        base = t.nextDouble();
        System.out.println(("ingresar la altura del Triangulo: "));
        altura = t.nextDouble();
        System.out.println("El color del tringualo es: "+triangulo1.getColor());
        System.out.println("El area del triangulo es: "+triangulo1.calcularArea());


    }
}