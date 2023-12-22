import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 人数
        int d = sc.nextInt();// 合宿日数
        int x = sc.nextInt();// 残りのチョコ

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;// もともとあったチョコの数
        for (int i = 0; i < n; i++) {
            int day = 1;
            while (day <= d) {
                count++;
                day += arr[i];
            }
        }

        System.out.println(count+x);
    }
}
