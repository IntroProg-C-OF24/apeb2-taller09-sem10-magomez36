package taller.pkg9.introprog.manuel.gomez;
import java.util.Scanner;
public class InicialdeEstudiantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while (bandera){
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            for (int i = 0; i < 7; i++) {
                char primeraLetra = estudiantes[i].charAt(0);
                if (String.valueOf(primeraLetra).equals(inicial))
                    bandera = false;
            }
        }
    }
}
//Desarrollado por Manuel Gomez