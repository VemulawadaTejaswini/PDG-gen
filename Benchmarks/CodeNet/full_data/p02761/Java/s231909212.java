import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int c = sc.nextInt();
            if(s==1 && c == 0) {
                System.out.println(-1);
                return;
            }
            if(num[n-s] != 0 && num[n-s] != c) {
                System.out.println(-1);
                return;
            } else {
                num[n-s] = c;
            }
        }
        System.out.println(num[0] + num[1]*10 + num[2]*100);
    }
}