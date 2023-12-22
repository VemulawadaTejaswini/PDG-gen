import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean flag = false;
        for (int a = 0; N - a >= 0; a += 7) {
            if ((N - a) % 4 == 0) {
                flag = true;
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}