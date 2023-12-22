import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        long[][] arr = new long[n][2];

        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int length = n * (n-1)/2;
        long[][] arr1 = new long[length][2];
        int left = 0;

        for(int i = 0; i < n; i++) {
            long x = arr[i][0];
            long y = arr[i][1];
            for (int j = i+1; j < n; j++) {
                long temp1 = arr[j][0];
                long temp2 = arr[j][1];
                arr1[left][0] = temp1 - x;
                arr1[left][1] = temp2 - y;
                left++;
            }
        }

        int max = 0;
        for(int i = 0; i < length; i++) {
            long p = arr1[i][0];
            long q = arr1[i][1];
            int temp = 1;
            for(int j = i+1; j < length; j++) {
                if(arr1[j][0] == p && arr1[j][1] == q){
                    temp++;
                }
            }
            if (temp > max) {
                max = temp;
            }
        }

        System.out.println(n - max);

    }
}
