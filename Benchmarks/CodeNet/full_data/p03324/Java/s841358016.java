import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int result = 0;
        if(n != 100){
            result = (int)(Math.pow(100,d)) * n;
        }else{
            result = (int)(Math.pow(100,d)) * 101; 
        }
        System.out.println(result);
        sc.close();
    }
}