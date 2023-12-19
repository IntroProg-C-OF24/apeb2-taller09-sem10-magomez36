package taller.pkg9.introprog.manuel.gomez;
import java.util.Scanner;
public class MarcasVehiculos {
    public static void main(String[] args) {
        int numeroMarcas, i = 0;
        String marca;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos Nombres de Marcas de Vehiculos desea Ingresar?");
        numeroMarcas = teclado.nextInt();
        String nombreMarcas[] = new String[numeroMarcas];
        while (i < nombreMarcas.length){
            System.out.println("Ingrese Marca del Vehiculo");
            marca = teclado.next();
            char primeraletra = marca.charAt(0);
            if ((String.valueOf(primeraletra).equals("A"))||(String.valueOf(primeraletra).equals("C"))||(String.valueOf(primeraletra).equals("T"))){
                System.out.println("-PALABRA NO VALIDA-");
                i--;
            }
            i++;
        }
    }
}
//Desarrollado por Manuel Gomez