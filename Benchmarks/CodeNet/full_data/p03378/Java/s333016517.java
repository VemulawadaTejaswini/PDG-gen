import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int a = sc.nextInt();
        int left = 0;
        while (a < X) {
            a = sc.nextInt();
            left++;
        }
        System.out.println(Math.min(left, M - left));
        
    }

}
