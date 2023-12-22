import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int max = -1;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if (max - array[i] > 1) {
                System.out.println("No");
                return;
            }
            max = Math.max(max, array[i]);
        }
        System.out.println("Yes");
    }
}