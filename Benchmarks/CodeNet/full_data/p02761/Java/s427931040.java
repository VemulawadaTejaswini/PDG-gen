import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        num[0] = num[1] = num[2] = -1;
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int c = sc.nextInt();
            if (s == 1 && c == 0) {
                System.out.println(-1);
                return;
            } else if(num[s-1] > 0 && num[s-1] != c) {
                System.out.println(-1);
                return;
            } else {
                num[s - 1] = c;
            }
        }
        for(int i = 0; i < 3; i++) {
            if(num[i]==-1) num[i] = 0;
        }
        System.out.println(num[0] * 100 + num[1] * 10 + num[2]);
    }
}