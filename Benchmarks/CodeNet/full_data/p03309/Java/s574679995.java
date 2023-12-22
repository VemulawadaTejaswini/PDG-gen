import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] array2 = new int[n];
        long ans = 0;
        long ans1 = 0;
        long ans2 = 0;
        long ans3 = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt() - (i + 1);
            array2[i] = array[i];
        }
        Arrays.sort(array2);
        long med = array2[n / 2];
        for (int i = 0; i < n; i++) {
            ans1 += Math.abs(array[i] - (ave - 1));
        }
        for (int i = 0; i < n; i++) {
            ans2 += Math.abs(array[i] - ave);
        }
        for (int i = 0; i < n; i++) {
            ans3 += Math.abs(array[i] - (ave + 1));
        }
        ans = Math.min(ans1, ans2);
        ans = Math.min(ans, ans3);
        System.out.println(ans);
    }    
}