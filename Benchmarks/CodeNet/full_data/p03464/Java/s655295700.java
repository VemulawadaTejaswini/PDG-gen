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
        
        int now = 2;
        
        if (array[n - 2] != 2 && array[n - 2] != 3) {
            System.out.println(-1);
            return;
        }
        
        for (int i = n - 1; i >= 0; i--) {
            int l = array[i];
            int r = now;
            
            if (l == 2 && r == 2){
                now = 2;
            } else if (l == 3 && r == 2) {
                now = 3;
            } else {
                if (l == r) continue;
                if (l >= r * 2) {
                    System.out.println(-1);
                    return;
                } else {
                    now = l * ((r / l) + 1);
                }
            }
        }
        
        int min = now;
        int max = array[0] * ((now / array[0]) + 1) - 1;
        
        System.out.println(min + " " + max);
    }
}
