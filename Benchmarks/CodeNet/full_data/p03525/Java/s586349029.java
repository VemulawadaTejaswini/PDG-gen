import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] circle = new int[24];
        circle[0] = 1;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            circle[t]++;
        }
        
        for (int i = 0; i <= 12; i++) {
            if (i == 0) {
                if (circle[i] > 1) {
                    System.out.println(0);
                    return;
                }
                continue;
            }
            
            if (i == 12) {
                if (circle[i] > 1) {
                    System.out.println(0);
                    return;
                }
                continue;
            }
            
            int t = circle[i];
            if (t >= 3) {
                System.out.println(0);
                return;
            } else if (t == 2) {
                circle[i] = 1;
                circle[24 - i] = 1;
            } else if (t == 1) {
                circle[i] = -1;
            }
        }
        
        int[] circle2 = new int[24];
        for (int i = 0; i < 24; i++) {
            if (circle[i] == 1) {
                circle2[i] = 1;
            }
        }
        
        int[] circle3 = new int[24];
        for (int i = 0; i < 24; i++) {
            if (circle2[i] == 1) {
                circle3[i] = 1;
            }
        }
        
        int max = 0;
        int combinationCount = (int)Math.pow(2, 11);
        for (int i = 0; i < combinationCount; i++) {
            String binaryNumber = Integer.toBinaryString(i);
            while (binaryNumber.length() < 11) {
                binaryNumber = "0" + binaryNumber;
            }
            
            for (int j = 0; j < 11; j++) {
                char c = binaryNumber.charAt(j);
                
                if (circle[j + 1] != -1) continue;
                
                if (c == '0') {
                    circle2[j + 1] = 1;
                } else {
                    circle2[24 - j - 1] = 1;
                }
            }
            
            int min = 100;
            int dif = 0;
            for (int j = 1; j < 24; j++) {
                if (circle2[j] == 1) {
                    min = Math.min(min, dif + 1);
                    dif = 0;
                } else {
                    dif++;
                }
            }
            
            min = Math.min(min, dif + 1);
            
            max = Math.max(max, min);
            
            for (int j = 0; j < 24; j++) {
                circle2[j] = circle3[j];
            }
        }
        
        System.out.println(max);
    }
}
