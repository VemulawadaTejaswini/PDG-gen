import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        int[] x = new int[n];
        int[] y = new int[m];
        int min = 101;
        int max = -101;
        String ans = "No War";
        for(int i=0; i<n; i++) {
            x[i] = Integer.parseInt(sc.next());
            if(max < x[i]) max = x[i];
        }
        for(int i=0; i<m; i++) {
            y[i] = Integer.parseInt(sc.next());
            if(min > y[i]) min = y[i];
        }
        if(max >= min) ans = "War";
        if(min <= X || max >= Y) ans = "War";
        System.out.println(ans); 
    }
    public static int max(int a, int b) {
        if(a <= b) return b;
        else return a;
    }

}
