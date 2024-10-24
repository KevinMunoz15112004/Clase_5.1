import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("----- Datos -----");
            System.out.println("1. Visualizar objetos de los Estudiantes");
            System.out.println("2. Visualizar objetos de los Ciudadanos");
            System.out.println("3. Visualizar objetos de las mascotas");
            System.out.println("4. Modificar valores de los Estudiantes");
            System.out.println("5. Modificar los valores de los Ciudadanos");
            System.out.println("6. Modificar los valores de las Mascotas");
            System.out.println("7. Imprimir los valores de los Estudiantes");
            System.out.println("8. Imprimr los valores de los Ciudadanos");
            System.out.println("9. Imprimir los valores de las Mascotas");
            System.out.println("10. Salir");
            System.out.println("Ingrese la opción: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:

            }
        }while (opcion != 6);

    }
}