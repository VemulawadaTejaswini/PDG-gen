import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int minPoint = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 1) {
                minPoint = i;
            }
        }
//        int left = minPoint;
//        int right = n - left - 1;
//        int ans = 0;
//        ans += (left / (k-1));
//        ans += right / (k-1);
//        ans += (left%(k-1)==0 ? 0 : 1);
//        ans += (right%(k-1) == 0 ? 0 : 1);
        int a = n-1;
        int b = k-1;
        System.out.println(a/b+(a%b==0?0:1));
    }
}