import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int[] ary1 = new int[a];
        for (int i = 0; i < a; i++) {
            ary1[i] = sc.nextInt();
        }
        int[] ary2 = new int[b];
        for (int i = 0; i < b; i++) {
            ary2[i] = sc.nextInt();
        }
        int[] ary3 = new int[c];
        for (int i = 0; i < c; i++) {
            ary3[i] = sc.nextInt();
        }
        
        Arrays.sort(ary1);
        Arrays.sort(ary2);
        Arrays.sort(ary3);
        
        long ans = 0;
        for (int i = 0; i < x; i++) {
            ans += ary1[a - 1 - i];
        }
        for (int i = 0; i < y; i++) {
            ans += ary2[b - 1 - i];
        }
        
        int i1 = (a - 1) - (x - 1);
        int i2 = (b - 1) - (y - 1);
        int i3 = c - 1;
        
        while (true) {
            if (i1 >= a || i2 >= b || i3 < 0) break;
            int az = ary1[i1];
            int bz = ary2[i2];
            int cz = ary3[i3];
            
            if (az >= cz && bz >= cz) break;
            
            if (az < bz) {
                if (az < cz) {
                    ans += (cz - az);
                    i3--;
                    i1++;
                }
            } else {
                if (bz < cz) {
                    ans += (cz - bz);
                    i3--;
                    i2++;
                }
            }
        }
        
        System.out.println(ans);
        
    }
}