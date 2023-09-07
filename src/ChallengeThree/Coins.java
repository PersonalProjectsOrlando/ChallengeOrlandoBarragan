/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChallengeThree;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Orlando B
 */
public class Coins {
    
    public static void main(String[] args) {
        
        int[] coinsRandom= new int[10];     // cantidad de monedas
        fillArrayRandom(coinsRandom,15);    //limite de numeros aleatorios
        
        int[] coins1 = {5, 7, 1, 1, 2, 3, 22};
        int[] coins2 = {1, 1, 1, 1, 1};
        int[] coins3 = {1, 5, 1, 1, 1, 10, 15, 20, 100};
        int[] coins4 = {1,2,4};
        
        readArray(coinsRandom);
        System.out.println("");        
        int minChange = findChange(coinsRandom);
        readArray(coinsRandom); System.out.println("-> " + minChange);
        
    }    
    public static void fillArrayRandom(int[] array, int limitRandom){
        Random random = new Random();
        for (int n = 0; n < array.length; n++) {
            int RandomNumber = random.nextInt(limitRandom)+1;
            array[n] = RandomNumber;
        }
    }
    public static void readArray(int[] arrayP){
        for (int n = 0; n < arrayP.length; n++) {
            System.out.print(arrayP[n] + " ");
        }
    }
    public static int findChange(int[] coins) {
        Arrays.sort(coins); 
        int Change = 1; 
        for(int i =0;i<coins.length;i++){
            if(coins[i] <= Change){
                Change += coins[i];
            }else{
                break;
            }
        }
        return Change;
    }
}
