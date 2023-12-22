import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String s = sc.next();
        String[] s1 = s.split("");
        if(s.substring(Integer.parseInt(a), Integer.parseInt(a)+1) == "-" &&  Integer.parseInt(a)+Integer.parseInt(b)+1==s1.length){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }




    }
}