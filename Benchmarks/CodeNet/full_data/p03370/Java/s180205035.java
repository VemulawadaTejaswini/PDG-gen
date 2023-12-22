import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] m = new int[n];
        int min = 1001;
        for(int i=0; i<n; i++) {
            m[i] = Integer.parseInt(sc.next());
            x -= m[i];
            if(min > m[i]) min = m[i];
        }
        System.out.println(n + x/min);
    }
}