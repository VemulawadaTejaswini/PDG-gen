import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        int n;
        String s,t;

        n=nextInt();
        s=next();
        t=next();
        char[] arr = new char[2*n];
        for(int i=0;i<n;i++){
            arr[2*i]=s.charAt(i);
            arr[2*i+1]=t.charAt(i);
        }
        for(char a:arr){
            System.out.printf("%c",a);
        }
    }



    public static int nextInt(){
        return Integer.parseInt(scan.next());
    }
    public static long nextLong(){
        return Long.parseLong(scan.next());
    }
    public static String next(){
        return scan.next();
    }
    public static double nextDouble(){
        return Double.parseDouble(scan.next());
    }
    public static float nextFloat(){
        return Float.parseFloat(scan.next());
    }

    //Yes or No
    public static void yesNo(boolean flag){
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
    public static void print(Object a){
        System.out.println(a);
    }
}