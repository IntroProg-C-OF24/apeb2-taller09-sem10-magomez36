package taller.pkg9.introprog.manuel.gomez;
public class EstadisticasEstudiantesParaleloC {
    public static void main(String[] args) {
        int numeroEst = 28, mejorEst = 0, peorEst = 0;
        double notasEst[] = new double[numeroEst], sumaNotas = 0, promedio, notaMayor, notaMenor;
        int estudiantes[] = new int [numeroEst];
        for (int i = 0; i < notasEst.length; i++) {
            notasEst[i] = (double)(Math.random()*(9-0+1)+0);
            estudiantes[i] = i+1;
        }
        System.out.println("================================= LISTADO DE NOTAS =======================================");
        for (int i = 0; i < notasEst.length; i++)
            System.out.printf("Nota del Estudiante %d: %.2f \n",estudiantes[i],notasEst[i]);
        for (int i = 0; i < notasEst.length; i++) 
            sumaNotas += notasEst[i];
        promedio = sumaNotas / notasEst.length;
        System.out.println("==========================================================================================");
        System.out.printf("El Promedio del ciclo, del paralelo C es: %.2f \n",promedio);
        System.out.println("==========================================================================================");
        System.out.println("Listado de estudiantes con su nota por ENCIMA del promedio");
        for (int i = 0; i < notasEst.length; i++)
            if (notasEst[i] > promedio)
                System.out.printf("-Estudiante %d: %.2f \n",estudiantes[i],notasEst[i]);
        System.out.println("==========================================================================================");
        System.out.println("Listado de estudiantes con su nota por DEBAJO del promedio");
        for (int i = 0; i < notasEst.length; i++)
            if (notasEst[i] < promedio)
                System.out.printf("-Estudiante %d: %.2f \n",estudiantes[i],notasEst[i]);
        notaMayor = notasEst[0];
        notaMenor = notasEst[0];
        for (int i = 0; i < 10; i++) 
            if (notasEst[i] > notaMayor){
                notaMayor = notasEst[i];
                mejorEst = estudiantes[i];
            }
            else if (notasEst[i] < notaMenor){
                notaMenor = notasEst[i];
                peorEst = estudiantes[i];
            }
        System.out.println("==========================================================================================");
        System.out.printf("-El Estudiante con la MEJOR calificacion es: Estudiante %d Calificacion: %.2f \n",mejorEst,notaMayor);
        System.out.printf("-El Estudiante con la calificacion mas BAJA es: Estudiante %d Calificacion: %.2f \n",peorEst,notaMenor);
        System.out.println("==========================================================================================");
    }
}
//Desarrollado por Manuel Gomez