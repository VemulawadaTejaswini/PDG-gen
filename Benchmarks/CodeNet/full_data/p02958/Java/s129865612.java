import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];
        int[] sorted_arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sorted_arr[i] = arr[i];
        }

        Arrays.sort(sorted_arr);
        int cnt = 0;
        for(int i = 0; i<n;i++){
            if(arr[i] != sorted_arr[i]){
                cnt++;

            }
        }

        if(cnt> 2){
            System.out.println("NO");
        }else
        {
            System.out.println("YES");
        }

    }
}
