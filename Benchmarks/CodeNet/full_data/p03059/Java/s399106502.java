import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int freqency = sc.nextInt();
        int cookie   = sc.nextInt();
        int time     = sc.nextInt();
        System.out.println((int)(Math.ceil((time+0.5)/freqency)*cookie));
    }
}