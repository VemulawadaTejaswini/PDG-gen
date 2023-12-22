import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String s = sc.next();
        String t  = s.substring(k - 1, k ).toLowerCase();
        System.out.println(s.substring(0, k - 1) + t + s.substring(k , n));

    }

}