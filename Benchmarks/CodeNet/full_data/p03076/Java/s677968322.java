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
       int minamari = 10;
       int sum = 0;
       for (int i = 0; i < 5; i++) {
           ar[i] = sc.nextInt();   
           if (ar[i] % 10 != 0) {
               minamari = Math.min(minamari, ar[i]%10);
               ar[i] = ar[i]/10*10+10;
           }
           sum += ar[i];
       }
       
       System.out.println(sum + minamari  - 10);

        sc.close();
    }

}



