/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{    
    static int[] parent;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long x = sc.nextInt();
        long ans = 2;
        for (int i = 0; i < x; i++) {
            ans = (ans+1)*2;
        }
        System.out.println(ans);

        sc.close();
    }
}