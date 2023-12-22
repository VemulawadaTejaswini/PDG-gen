import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        boolean[] win = new boolean[k+1];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 1 ; i<=k;++i){
            for(int j = 0 ;j<n;++j){
                win[i] |= arr[j] <= i && !win[i-arr[j]];
            }
        }
        System.out.println(win[k]?"First":"Second");
    }
}