import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float catetoa;
        do {
            System.out.println("Ingrese cateto A");
            catetoa = sc.nextFloat();
            if (catetoa <=0)
            {
                System.out.println("Debe ingresar un valor mayor a cero ");
            }
        } while (catetoa<=0);

        float catetob;
        do {
            System.out.println("Ingrese cateto B:");
            catetob = sc.nextFloat();
            if (catetob <=0)
            {
                System.out.println("Debe ingresar un valor mayor a cero ");
            }
        } while(catetob<=0);

        double hipotenusa;
        hipotenusa = sqrt( catetoa*catetoa + catetob*catetob);
        System.out.println("La hipotenusa es : " + hipotenusa);
    }
}


