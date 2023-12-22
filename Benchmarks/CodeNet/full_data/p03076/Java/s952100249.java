import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int tmp = 0;
        int tmp2 = 10 - (array[0] % 10);
        for (int i = 0; i < n; i++) {
            if (array[i] % 10 == 0) continue;
            if (tmp2 < 10 - (array[i] % 10)) {
                tmp2 = 10 - (array[i] % 10);
                tmp = i;
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (tmp == i) continue;
            if (array[i] % 10 != 0) {
                array[i] += 10 - (array[i] % 10);
            }
            count += array[i];
        }
        count += array[tmp];
        
        System.out.println(count);
    }
}
