import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (counter + 1 == num) {
                counter++;
            }
        }
        
        if (counter == 0) {
            System.out.println(-1);
            return;
        }
        
        System.out.println(n - counter);
    }
}
