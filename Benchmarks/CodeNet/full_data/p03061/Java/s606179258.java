import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        if(n == 2){
            System.out.println(Math.max(a[0], a[1]));
            return;
        }
        
        int gcd;
        int x;
        int gcd01 = gcd(a[0], a[1]);
        int gcd02 = gcd(a[0], a[2]);
        int gcd12 = gcd(a[1], a[2]);
        if(gcd01 > gcd02){
            if(gcd01 > gcd12){
                gcd = gcd01;
                x = 2;
            }else{
                gcd = gcd12;
                x = 0;
            }
        }else if(gcd02 > gcd12){
            gcd = gcd02;
            x = 1;
        }else{
            gcd = gcd12;
            x = 0;
        }
        
        int gcdX = gcd(a[x], gcd);
        int gcdI;
        for(int i = 3; i < n; i++){
            gcdI = gcd(a[i], gcd);
            if(gcdI < gcdX){
                gcd = gcdX;
                gcdX = gcdI;
            }else{
                gcd = gcdI;
            }
        }
        
        System.out.println(gcd);
    }
    
    private static int gcd(int a, int b){
        
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
}