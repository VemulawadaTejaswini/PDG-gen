import java.util.Scanner;

public class Main {

    public static int ans(int stones[], int n, int k){
        int storage[] = new int[n+1];
        storage[1] = 0;
        for(int i=2; i<=n; i++){
           storage[i] = Integer.MAX_VALUE;

           for(int j=i-1; j>=1 && (i-j)<=k; j--){
               storage[i] = Math.min(Math.abs(stones[i] - stones[j]) + storage[j], storage[i]);
           }

        }
        return storage[n];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int stones[] = new int[n+1];
        for(int i=1; i<=n; i++){
            stones[i] = sc.nextInt();
        }
        System.out.println(ans(stones, n, k));
    }
}