import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long q = sc.nextLong();
        long h = sc.nextLong();
        long s = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();
        sc.close();
        
        if(q*2 < h) h = q*2;
        if(h*2 < s) s = h*2;
        if(s*2 < d){
            System.out.print(n*s);
        }else{
            if(n%2 == 0){
                System.out.print(n*d/2);
            }else{
                System.out.print((n/2)*d + s);
            }
        }
    }
}