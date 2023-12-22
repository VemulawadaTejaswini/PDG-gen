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
        
        if (array[0] != 0) {
            System.out.println(-1);
            return;
        }
        
        long count = 0;
        int now = 0;
        for (int i = 0; i < n; i++) {
            int num = array[i];
          	if (num > i) {
              	System.out.println(-1);
              	return;
            }
            if (num == now + 1) {
                count++;
            } else if (num == now) {
                count += num;
            } else if (num > 0) {
                count += num;
            }
            now = num;
        }
        
        
        System.out.println(count);
    }
}
