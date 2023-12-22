import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int first = -1;
        int second = -2;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            
            if (array[i] > first) {
                second = first;
                first = array[i];
            } else if (array[i] > second) {
                second = array[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (array[i] == first) {
                System.out.println(second);
            } else {
                System.out.println(first);
            }
        }
    }
}
