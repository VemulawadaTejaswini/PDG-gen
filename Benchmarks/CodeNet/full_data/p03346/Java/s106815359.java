import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            array[i][1] = 1;
        }
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if (array[j][0] + 1 == array[i][0]) {
                    array[j][1]++;
                    array[j][0]++;
                }
            }
        }
        
        
        int max = 0;
        for (int[] a : array) {
            max = Math.max(max, a[1]);
        }
        
        System.out.println(n - max);
    }
}
