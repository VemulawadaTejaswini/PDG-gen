import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        long diff = Math.abs(n - k);
        if(diff == 0) {
            System.out.println("0");
            return;
        }

        System.out.println(Math.min(n%diff, Math.abs((n%diff)-k)));
    }
}