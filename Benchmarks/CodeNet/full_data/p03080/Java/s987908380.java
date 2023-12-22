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
        
        int n = sc.nextInt();
        int countr = 0;
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R' ) {
                countr++;
            }
        }
        
        if (countr * 2 > n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }

}



