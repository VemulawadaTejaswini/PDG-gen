import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt()-1;
        }
        sc.close();

        int cnt = 0;
        int tmp = 0;
        for(int i=0; i<n; i++) {
            cnt++;
            tmp = a[tmp];
            if(tmp == 1) {
                break;
            }
        }
        if(cnt == n) {
            System.out.println(-1);
        } else {
            System.out.println(cnt);
        }
    }
}
