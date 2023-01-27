/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryseacrh;

/**
 *
 * @author yonathan
 */
public class Binaryseacrh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] intArray = {22,13,42,12,53,64,74,52,67};
        
        System.out.println(iterativeBinarySearch(intArray, 22));
    }
    
    public static int iterativeBinarySearch(int[] input, int value){
        int mulai = 0;
        int akhir = input.length;
        
        while(mulai < akhir){
            int midpoint = (mulai + akhir)/2;
            System.out.println("Mid point = " + midpoint);
            if(input[midpoint] == value){
                return midpoint;
            }else if(input[midpoint] < value){
                mulai = midpoint + 1;
            }else{ akhir = midpoint;
            
            }
        }
        return -1;
    }
    
    public static int recursiveBinarySearch(int[] input,int value){
        return recursiveBinarySearch(input, 0, input.length, value);
    }
    public static int recursiveBinarySearch(int[] input,int mulai, int akhir, int vaue){
        if(mulai >= akhir){
            return -1;
       }
        int midpoint = (mulai + akhir)/2;
        
        System.out,println("Midpoint = " + midpoint);
        if(input[midpoint] == value){
            return midpoint;
        }else if(input[midpoint] < value){
            return recursiveBinarySearch(input, midpoint + 1, akhir, value);
        }else{
            return recursiveBinarySearch(input, mulai, midpoint, value);
        }
    }
}
    
       
