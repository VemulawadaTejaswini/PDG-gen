//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111

import java.util.*;
import java.lang.*;

public class Main
{  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt(); int ans = 0;
        if(n>500) {
            ans = (n/500)*1000;
            n = n%500;
        }
        if(n > 5) {
            ans += (n/5)*5;
        }
        System.out.println(ans);
    }
}