import java.io.InputStream;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main S = new Main();

        System.out.println(S.div(n, arr));;
    }

    public int div(int n, int[] arr){
        Arrays.sort(arr);
        if (n==0) return 0;
        if (n%2==1) return 0;
        int middle = n/2 - 1;
        if (arr[middle] == arr[middle+1]){
            return 0;
        }

        return arr[middle+1] - arr[middle];
    }
}
