import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        
        int count = 0;
        int min = 99999999;
        while (n-- > 0) {
            int num = sc.nextInt();
            if (num < min) {
                count++;
                min = num;
            }
        }
        System.out.println(count);
    }
}
