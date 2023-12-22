import java.util.*;
import java.io.*;
 
class AtCoder{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[2*n];
        for(int i = 0; i < 2*n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = 0;
        for(int i = 2*n - 1; i > 0; i -= 2){
            ans += Math.min(arr[i], arr[i-1]);
        }
        System.out.println(ans);
    }
}