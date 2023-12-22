import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int[][] arr = new int[n][2];

        for (int i=0; i<n; i++){
            int x = sc.nextInt();
            int l = sc.nextInt();
            int left = x-l;
            int right = x+l;
            arr[i][0] = left;
            arr[i][1] = right;
        }

        Arrays.sort(arr, (a, b)->Integer.compare(a[1], b[1]));

//        System.out.println(arr[0][1]);

        int min = arr[0][1];

        ans++;

        for (int i=1; i<n; i++){
            if (arr[i][0]>=min){
                ans++;
                min = arr[i][1];
            }
        }
        System.out.println(ans);
    }
}
