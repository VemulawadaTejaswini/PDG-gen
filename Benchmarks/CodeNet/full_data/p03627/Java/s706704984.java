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
        Arrays.sort(array);
        
        int x = 0;
        int y = 0;
        for (int i = n-1; i >= 1; i--) {
            if (array[i] == array[i-1]) {
                if (x == 0) {
                    // System.out.println(i);
                    x = array[i];
                    i--;
                } else if (y == 0) {
                    // System.out.println(i);
                    y = array[i];
                    i--;
                    break;
                }
            }
        }
        System.out.println(x * y);
    }
}
