import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            a = a /2 - 1;
        }else{
            a = a / 2;
        }
        System.out.println(a);
        sc.close();
    }
}