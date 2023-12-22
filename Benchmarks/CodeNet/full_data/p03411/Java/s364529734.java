import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] axR = new int[n];
        int[] axB = new int[n];
        
        Map<Integer, Integer> xyR = new HashMap<Integer, Integer>();
        Map<Integer, Integer> xyB = new HashMap<Integer, Integer>();
        
        
        for (int i = 0; i < n; i++) {
            axR[i] = sc.nextInt();
            xyR.put(axR[i], sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            axB[i] = sc.nextInt();
            xyB.put(axB[i], sc.nextInt());
        }
        Arrays.sort(axB);
        Arrays.sort(axR);
        int count = 0;
        boolean[] r = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            int xB = axB[i];
            int yB = xyB.get(xB);
            
            int tempJ = -1;
            int sumD2 = 10000000;
            for (int j = 0; j < n; j++) {
                int xR = axR[j];
                int yR = xyR.get(axR[j]);
                if (!r[j] && xR < xB && yR < yB) {
                    int dx = xB - xR;
                    int dy = yB - yR;
                    if (sumD2 > dx*dx + dy*dy) {
                        tempJ = j;
                        sumD2 = dx*dx + dy*dy;
                    }
                }
            }
            if (tempJ != -1) {
                r[tempJ] = true;
                count++;
            }
        }
        System.out.println(count);
    }
}
