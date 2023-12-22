import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i=1; i<=9; i++) {
            for (int j = i; j <= 9; j++) {
                if (i * j == N) {
                    System.out.println("Yes");
                    break;
                }
            }
        }
        System.out.println("No");
    }
}