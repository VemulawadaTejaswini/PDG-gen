import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] ary = new int[N];
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(sc.next());
            ary[i] = a;
        }
        int temp1 = ary[0];
        int temp2 = 0;
        int temp3 = 0;
        int cnt = 1;
        for (int i = 1; i < N; i++) {
            if (ary[i] <= temp1) {
                temp2 = temp1;
                if (cnt % 2 == 1) {
                    temp3 = temp1;
                }
                temp1 = ary[i];
                cnt++;
                if (temp1 > temp3) {
                    cnt--;
                }
            } else {
                temp1 = ary[i];
            }
        }
        System.out.println(cnt);
    }
}