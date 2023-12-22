import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        Arrays.fill(array, -1);
        int x = n;
        
        int index = 0;
        while (x-- > 0) {
            int num = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (num > array[i]) {
                    array[i] = num;
                    index = Math.max(index, i);
                    break;
                }
            }
        }
        System.out.println(index + 1);
    }
}
