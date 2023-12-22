import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        int re = 0;
        int ans = 0;
        for (int i = 0; N > i; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 4 == 0) {
                ans++;
            }
            if (a[i] == 2) {
                re++;
            }
        }
        if(re<=4){
            N=N-re;
        }
        if (N/ 2 <= ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}