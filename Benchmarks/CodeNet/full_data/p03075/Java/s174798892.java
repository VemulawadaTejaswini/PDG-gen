/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
       int[] ar = new int[5];
       for (int i = 0; i < 5; i++) {
           ar[i] = sc.nextInt();   
       }
       int k = sc.nextInt();
       Arrays.sort(ar);
       if (ar[5] - ar[0] <= k) {
           System.out.println("Yay!");
       } else {
           System.out.println(":(");
       }

        sc.close();
    }

}



