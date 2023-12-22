import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int count = 0;
        while(!isAllZero(h)) {
            int l = 0;
            int r = 1;
            while(l < n && h[l] == 0) l++;
            r = l + 1;
            while(r < n && h[r] != 0) r++;
            water(l, r, h);
            count++;
        }
        System.out.println(count);
    }
    private static boolean isAllZero(int[] h) {
        for(int i = 0; i < h.length; i++) {
            if(h[i] != 0) return false;
        }
        return true;
    }
    private static void water(int l, int r, int[] h) {
        while(l < h.length && l < r) {
            h[l]--;
            l++;
        }
    }
}
