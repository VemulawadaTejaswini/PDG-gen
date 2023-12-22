import java.util.*;
public class Main {

    private static boolean check(int[] arr, int num) {
        String str = String.valueOf(num);
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int nu = Integer.valueOf(c);
            for(int j = 0; j < arr.length; j++) {
                int val = arr[j];   
                if (nu == val) {
                    return false;
                }
            }
            
        }
        return true; 
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = N;
        while(true) {
            if (check(arr, ans)) {
                break;
            }
            ans++;
        }
        System.out.println(ans);
    }
}	