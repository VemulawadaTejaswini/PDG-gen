import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int[] arr = new int[n];
    public static void main(String[] args){
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        long ans = 0;

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                int left = j;
                int right = arr.length;
                while (left<right){
                    int mid = (left+right)/2;
                    if (arr[mid]<arr[i]+arr[j]){
                        left = mid+1;
                    }else {
                        right = mid;
                    }
                }
                ans += (left-j-1);
            }
        }
        System.out.println(ans);
    }
    private static int lowerbound(int[] arr, int v){
        int left = 0;
        int right = arr.length;
        while (left<right){
            int mid = (left+right)/2;
            if (arr[mid]<v){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return left;
    }
}