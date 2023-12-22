import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt() - 1;
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = array[i];
            int b = array[a];
            
            if (b == i) count++;
        }
        System.out.println(count / 2);
    }
}
