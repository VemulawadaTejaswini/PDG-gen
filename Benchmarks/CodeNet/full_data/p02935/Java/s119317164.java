 
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
  class Main  {
     public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
         int x = scan.nextInt();
         double arr[] = new double[x];
         for(int i = 0 ; i < x ;i++){
             arr[i] = scan.nextInt();
         }
         Arrays.sort(arr);
         for(int i = 0 ;i<x-1 ; i++){
             
             arr[i+1] = (arr[i] + arr[i+1])/2 ;
         }
         if(arr[arr.length-1]  - (int)arr[arr.length-1] == 0 ){
             System.out.println((int)arr[arr.length-1]);
         }else{
         System.out.println(arr[arr.length-1]);
     
         }
     }
}
