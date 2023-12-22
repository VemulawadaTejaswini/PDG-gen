import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n1 = n / 10000000;
        int n2 = (n % 10000000) / 1000000;
        int n3 = (n % 1000000) / 100000;
        int n4 = (n % 100000) / 10000;
        int n5 = (n % 10000) / 1000;
        int n6 = (n % 1000) / 100;
        int n7 = (n % 100) / 10;
        int n8 = n % 10;
        int harsh = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8;
        if (n % harsh == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}