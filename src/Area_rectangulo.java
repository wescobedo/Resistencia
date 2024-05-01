import java.util.Scanner;
public class Area_rectangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float lado1;
        do {
            System.out.println("Ingrese lado1:");
            lado1 = sc.nextFloat();
        } while (lado1<=0);

        float lado2;
        do {
            System.out.println("Ingrese lado2:");
            lado2 = sc.nextFloat();
        } while (lado2<=0);

        float perimetro;
        perimetro = 2*lado1+2*lado2;
        System.out.println("El perimetro es : " + perimetro);
    }
}
