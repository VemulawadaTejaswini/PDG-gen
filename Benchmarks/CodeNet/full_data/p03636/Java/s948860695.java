import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        char st = str.charAt(0);
        char go = str.charAt(n - 1);
        int m = n - 2;
        System.out.print(st);
        System.out.print(m);
        System.out.println(go);


    }
}