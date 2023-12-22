import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] answer = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            array[i] = num;
            sum += num;
        }
        
        int sum2 = sum;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                sum2 -= array[i] * 2;
            }
        }
        answer[0] = sum2;
        
        for (int i = 1; i < n; i++) {
            answer[i] = array[i - 1] * 2 - answer[i - 1];
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(answer[i]);
        }
    }
}
