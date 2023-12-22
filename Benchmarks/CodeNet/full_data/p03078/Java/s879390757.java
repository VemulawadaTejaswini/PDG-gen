import java.util.*;
     
public class Main {
    
    private long[] tasteList;
    private int k = 0;
     
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.exec();
    }
     
    private void read() {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        k = scan.nextInt();
        long[] xList = new long[x];
        for (int i = 0; i < x; i++) {
            xList[i] = scan.nextLong();
        }
        long[] yList = new long[y];
        for (int i = 0; i < y; i++) {
            yList[i] = scan.nextLong();
        }
        long[] zList = new long[z];
        for (int i = 0; i < z; i++) {
            zList[i] = scan.nextLong();
        }
        Arrays.sort(xList);
        Arrays.sort(yList);
        Arrays.sort(zList);
        tasteList = new long[k * 3];
        int index = 0;
        for (int l = 1; l <= k && l <= x; l++) {
            for (int m = 1; m <= k && m <= y; m++) {
                for (int n = 1; n <= k && n <= z; n++) {
                    tasteList[index++] = xList[x - l] + yList[y - m] + zList[z - n];
                    if (index >= k * 3) {
                        return;
                    }
                }  
            }    
        }
    }
     
    private void exec() {
        Arrays.sort(tasteList);
        for (int i = 1; i <= k; i++) {
             System.out.println(String.valueOf(tasteList[k * 3 - i]));
        }
    }
}