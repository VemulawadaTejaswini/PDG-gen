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
        for (int i = 1; i < n - 1; i++) {
            if (array[i-1] < array[i]) {
                if (array[i] < array[i+1]) {
                    count++;
                }
            } else {
                if (array[i] > array[i+1]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
