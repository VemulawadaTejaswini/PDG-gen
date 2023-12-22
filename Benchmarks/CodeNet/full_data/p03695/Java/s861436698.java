import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] colors = new int[9];
        
        while (n-- > 0) {
            int rate = sc.nextInt();
            int colorNumber = getColor(rate);
            colors[colorNumber]++;
        }
        
        int min = 0;
        int max = 0;
        for (int i = 0; i < 8; i++) {
            if (colors[i] > 0) min++;
        }
        
        max = min + colors[8];
        
        if (min == 0) {
            min = 1;
        }
        
        System.out.println(min + " " + max);
    }
    
    public static int getColor(int rate) {
        if (rate < 400) {
            return 0;
        } else if (rate < 800) {
            return 1;
        } else if (rate < 1200) {
            return 2;
        } else if (rate < 1600) {
            return 3;
        } else if (rate < 2000) {
            return 4;
        } else if (rate < 2400) {
            return 5;
        } else if (rate < 2800) {
            return 6;
        } else if (rate < 3200) {
            return 7;
        }
        return 8;
    }
}
