package taller.pkg9.introprog.manuel.gomez;
public class ArregloMediaAritmetica {
    public static void main(String[] args) {
        int array[] = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21}, mediaAritmetica, sumaN = 0, elementosA= 0, elementosB= 0;
        for (int i = 0; i < 10; i++) 
            sumaN += array[i];
        mediaAritmetica = sumaN / array.length;
        for (int i = 0; i < 10; i++) 
            if (array[i] >= mediaAritmetica)
                elementosA++;
            else if (array[i] < mediaAritmetica)
                elementosB++;
        System.out.println("Hay "+elementosA+" elementos que estan por ARRIBA de la media aritmetica");
        System.out.println("Hay "+elementosB+" elementos que estan por DEBAJO de la media aritmetica");
    }
}
//Desarrollado por Manuel Gomez