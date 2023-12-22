import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][3];
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
            array[i][2] = sc.nextInt();
        }
        
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                int high = Math.abs(i-array[0][0]) + Math.abs(j-array[0][1]) + array[0][2];
                
                boolean ok = true;
                for (int k = 1; k < n; k++) {
                    int h = Math.abs(i-array[k][0]) + Math.abs(j-array[k][1]) + array[k][2];
                    if (Math.abs(i-array[k][0]) + Math.abs(j-array[k][1]) > high) {
                        if (array[k][2] == 0) continue;
                    }
                    if (h != high) {
                        ok = false;
                        break;
                    }
                }
                
                if (ok) {
                    System.out.println(i + " " + j + " " + high);
                    return;
                }
            }
        }
    }
}