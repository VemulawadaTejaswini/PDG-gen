import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > 1) {
                count += array[i] / 2;
                array[i] -= array[i] / 2 * 2;
                i--;
            } else if (array[i] == 1) {
                if (i == n - 1) break;
                if (array[i + 1] != 0) {
                    array[i]--;
                    array[i + 1]--;
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
