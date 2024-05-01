import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //
        // definir nombre como caracter
        //String nombre = "Waldo";
        //System.out.println("hola " + nombre);
        //leer
        Scanner entrada =  new Scanner(System.in);
        //nombre = entrada.next();
        //System.out.println("hola " + nombre);

        System.out.println("ingrese nombre completo");
        String nombre_completo= entrada.nextLine();

        System.out.println("ingrese asignatura");
        String asignatura= entrada.nextLine();

        System.out.println("ingrese nombre docente");
        String nombre_docente= entrada.nextLine();

        System.out.println("ingrese nota 1");
        float nota1= entrada.nextFloat();
        System.out.println("ingrese nota 2");
        float nota2= entrada.nextFloat();
        System.out.println("ingrese nota 3");
        float nota3= entrada.nextFloat();

        float promedio = (nota1+nota2+nota3)/3;
        System.out.println("el promedio es: " + promedio);

        if (promedio >=4) {
            System.out.println(" Aprobastes!" );
        }
            else{
            System.out.println("Reprobastes ");
            }
        }
    }
