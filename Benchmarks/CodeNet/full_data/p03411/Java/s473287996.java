import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] redx = new int[n];
        int[] redy = new int[n];
        int[] bluex = new int[n];
        int[] bluey = new int[n];
        
        for (int i = 0; i < n; i++) {
            redx[i] = sc.nextInt();
            redy[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bluex[i] = sc.nextInt();
            bluey[i] = sc.nextInt();
        }
        
        Arrays.sort(redx);
        Arrays.sort(redy);
        Arrays.sort(bluex);
        Arrays.sort(bluey);
        int i = 0;
        int j = 0;
        int count = 0;
        while (true) {
            if (redx[i] < bluex[j] && redy[i] < bluey[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
            if (j == n) break;
        }
        
        System.out.println(count);
    }
}