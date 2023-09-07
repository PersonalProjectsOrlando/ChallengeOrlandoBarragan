/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChallengeOne;


import java.util.Random;

/**
 *
 * @author Orlando B
 */
public class Digits {

    public static void main(String[] args) {
        int[] arrayNumbers = new int[10];       // # de numeros en el array
        FillArray(arrayNumbers);       
    }

    public static void FillArray(int[] arrayNumbers) {
        int count1 = 0;
        int count2 = 0;
        int countNonZero = 0;
        Random random = new Random();
        // llena al array con numero aleatorios de 1 a n
        for (int n = 0; n < arrayNumbers.length; n++) {
            int RandomNumber = random.nextInt(100);
            arrayNumbers[n] = RandomNumber;
            System.out.print(RandomNumber + " ");
            count1++;
        }
        //orderNumber(arrayNumbers);
        System.out.println("\n");
        for (int i = 0; i < arrayNumbers.length; i++) {
            int modifiedNumber = removeDigit(arrayNumbers[i]);
            if(modifiedNumber!=0){
                System.out.print(modifiedNumber+" ");
                count2++;
            }
        }

        System.out.println("\n");
        System.out.println("Count1: " + count1);
        System.out.println("Count2: " + count2);
        //System.out.println("countNonZero: " + countNonZero);

    }

    // Metodos complementarios
        
    public static int removeDigit(int number) {
        int result = 0;
        int position = 1;

        while (number > 0) {
            int digit = number % 10;    //se obtiene el último dígito de number
            if (digit != 4) {       // construye 
                result += digit * position;
                position *= 10;     // Se actualiza position multiplicándolo por 10, lo que permite construir el número resultante en la posición correcta.
            }                       // position es 10 100 1000 1000
            number = number / 10;   // Se divide number por 10 para eliminar el último dígito y avanzar al siguiente.
        }
        return result;
    }
    // metodo de ordenamiento burbuja
    public static void orderNumber(int[] arrayNumbers) {
        for (int i = 0; i < arrayNumbers.length - 1; i++) { //después de cada pasada del bucle externo, el elemento más grande se coloca en la última posición, por lo que no es necesario volver a compararlo en las siguientes pasadas.
            for (int j = 0; j < arrayNumbers.length - 1 - i; j++) {
                if (arrayNumbers[j] > arrayNumbers[j + 1]) {    // compara cada elemento actual con el siguiente

                    int temp = arrayNumbers[j];
                    arrayNumbers[j] = arrayNumbers[j + 1];
                    arrayNumbers[j + 1] = temp;
                }
            }
        }
    }
}
