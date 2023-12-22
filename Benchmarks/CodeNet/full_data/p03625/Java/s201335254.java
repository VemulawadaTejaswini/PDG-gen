import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int ans[] = new int[100000];
        int tate = 0;
        int yoko = 0;
        for (int i = 0; N > i; i++) {
            A[i] = sc.nextInt();
        }
        for (int j = 0; N > j; j++) {
            ans[A[j]]++;
        }
        lavel:
        for (int a = 10000; 0 <= a; a--) {
            if (ans[a] >= 2) {
                tate = a;
                ans[a] = ans[a] - 2;
                for (int b = a; 0 <= b; b--) {
                    if (ans[b] >= 2) {
                        yoko = b;
                        break lavel;
                    }
                }
            }
        }
        System.out.println(tate * yoko);
    }
}
