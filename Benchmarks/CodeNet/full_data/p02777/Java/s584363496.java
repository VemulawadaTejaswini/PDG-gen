import java.util.Scanner;
import java.util.LinkedList;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next(),
            t = sc.next();
        int a=sc.nextInt(),
            b=sc.nextInt();
        String u = sc.next();

        sc.close();
        if(u.equals(s)){
            a--;
        }else{
            b--;
        }
        System.out.print(a+" "+b);
        
    }
}