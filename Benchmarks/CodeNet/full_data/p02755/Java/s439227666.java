import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int taxA = 0;
        int taxB = 0;
        long n = 1;
        while(taxA <= A && taxB <= B){
            taxA = (int) Math.floor(n * 0.08);
            taxB = (int) Math.floor(n * 0.10);
            if(taxA == A && taxB == B){
                System.out.println(n);
                return;
            }
            n++;
        }
        System.out.println(-1);
    }
}