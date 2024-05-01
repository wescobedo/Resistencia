import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float r1;
        do {
            System.out.println("Ingrese resistencia 1");
            r1 = sc.nextFloat();
            if (r1<=0)
            {
                System.out.println("Debe ingresar un valor mayor a cero ");
            }
        } while (r1<=0);

        float r2;
        do {
            System.out.println("Ingrese resistencia 2");
            r2 = sc.nextFloat();
            if (r2<=0)
            {
                System.out.println("Debe ingresar un valor mayor a cero ");
            }
        } while (r2<=0);

        float r3;
        do {
            System.out.println("Ingrese resistencia 3");
            r3 = sc.nextFloat();
            if (r3<=0)
            {
                System.out.println("Debe ingresar un valor mayor a cero ");
            }
        } while (r3<=0);

        float resistencia = (float)1/(1/r1+1/r2+1/r3);

        System.out.println("La resistencia total es de : " + resistencia);

    }
}
