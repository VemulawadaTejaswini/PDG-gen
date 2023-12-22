import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int lcm = (a * b) / gcd(a,b);
        System.out.println(lcm);
        
    }

    private static int gcd(int a,int b){

        if(a < b){
            int tmp = a;
            a = b;
            b = tmp;
        }

        int d = a%b;

        if(d==0)return b;
        else return gcd(b,d);
        
    }
}


