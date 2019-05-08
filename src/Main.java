public class Main {
    public static void main(String args[]){

        Quadrado q1 = new Quadrado(10);
        System.out.println("Area do Quadrado = "+q1.calcArea());
        System.out.println("Perimetro Quadrado = "+q1.perimetro());

        Circulo c1 = new Circulo(5);
        System.out.println("Area do Circulo = "+c1.calcArea());
        System.out.println("Perimetro Circulo = "+c1.perimetro());

        Retangulo r1 = new Retangulo(8,9);
        System.out.println("Area do Retangulo = "+r1.calcArea());
        System.out.println("Perimetro Retangulo = "+r1.perimetro());
    }
}
