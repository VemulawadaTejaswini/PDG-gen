import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        long diff = Math.abs(n - k);
        
        System.out.println(Math.min(n%diff, Math.abs((n%diff)-k)));
    }
}
