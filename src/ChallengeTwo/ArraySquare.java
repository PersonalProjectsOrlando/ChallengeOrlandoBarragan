/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChallengeTwo;

import ChallengeOne.Digits;
import static ChallengeOne.Digits.orderNumber;
import static ChallengeThree.Coins.readArray;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Orlando B
 */
//[0,44]
public class ArraySquare {

    public static int lengthArray = 10;    // arreglo de longuitud 10 para ambos arrays

    public static void main(String[] args) {

        int[] arrayNumbers = new int[lengthArray];
        // array cata 
        int[] arrayNumbers1 ={-6, -5, 0, 5, 10};       
        System.out.println("Numbers Generate: ");      
        readArray(arrayNumbers1);
        System.out.println(""); 
        System.out.println("Numbers Square:");
        arraySquare(arrayNumbers1);

    }

    public static int[] FillArray1(int[] arrayNumbers1) {
        int count1 = 0;
        int count2 = 0;
        
        // so that we can read the tasting array we eliminate the Random generation
        /*Random random = new Random();
        for (int n = 0; n < arrayNumbers1.length; n++) {
            int RandomNumber = random.nextInt(10);
            arrayNumbers1[n] = RandomNumber;
            count1++;
        }*/
        
        orderNumber(arrayNumbers1);
        for (int i = 0; i < arrayNumbers1.length; i++) {
            if (arrayNumbers1[i] != 0) {
                System.out.print(arrayNumbers1[i] + " ");

            }
            count2++;
        }

        System.out.println("");
        System.out.println("Count Generate: " + count1);
        System.out.println("Count Read: " + count2);
        System.out.println("");
        return arrayNumbers1;
    }

    public static void arraySquare(int[] arrayNumbers1) {
        double square = 0;
        int countSquare = 0;
        int[] arraySquare = new int[lengthArray];
        for (int i = 0; i < arrayNumbers1.length; i++) {
            square = Math.pow(arrayNumbers1[i], 2);
            if (square < 44 && arrayNumbers1[i] != 0) {
                arraySquare[i] = (int) square;
            }
        }
        orderNumber(arraySquare);
        for (int j = 0; j < arraySquare.length; j++) {
            if (arraySquare[j] != 0) {
                System.out.print(arraySquare[j] + " ");
            }
        }
        System.out.println("");
    }
    public static int[] fillArrayRandom(int[] array, int limitRandom){
        Random random = new Random();
        for (int n = 0; n < array.length; n++) {
            int RandomNumber = random.nextInt(limitRandom)+1;
            array[n] = RandomNumber;
        }
        return array;
    }
}
