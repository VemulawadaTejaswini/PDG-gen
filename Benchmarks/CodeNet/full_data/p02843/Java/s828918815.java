import java.util.*;
import java.lang.*;


public class Main {
    static void possible(){
        System.out.println(1);
        System.exit(0);
    }
    static void impossible(){
        System.out.println("0");
        System.exit(0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        for(int amount = X/100; amount>=X/105; amount--){
            int penny = X - amount*100;
            if(0<=penny && penny<=5*amount) possible();
        }
        impossible();
    }
}
