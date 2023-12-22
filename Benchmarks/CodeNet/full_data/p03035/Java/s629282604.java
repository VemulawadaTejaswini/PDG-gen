import java.util.*;
import java.lang.*;

public class Main {

    static long gcd(long a, long b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int cost = sc.nextInt();

        int takCost;
        if(age<=5) takCost=0;
        else if(age<=12) takCost = cost/2;
        else takCost = cost;

        System.out.println(takCost);

    }
}