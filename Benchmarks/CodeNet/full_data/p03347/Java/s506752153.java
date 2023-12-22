import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            if(arr[i] > i) {
                System.out.println(-1);
                return;
            }
        }
        long ans = 0L;
        if(arr[0]!=0) {
            System.out.println(-1);
            return;
        }
        for(int i = 1; i < n; i++) {
            long backNum = arr[i-1];
            long nowNum = arr[i];
            if(nowNum > backNum) {
                ans += nowNum-backNum;
            } else {
                ans += nowNum;
            }
        }
        System.out.println(ans);
    }
}