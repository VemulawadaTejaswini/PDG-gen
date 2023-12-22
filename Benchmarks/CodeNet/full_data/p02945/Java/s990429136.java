import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = a+b;
        int m=a-b;
        int x=a*b;
        int max = Math.max(p, Math.max(m, x));
        System.out.println(max);
    }

}