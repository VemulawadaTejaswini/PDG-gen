import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int  i=0;i<n;i++) {
            p[i] = sc.nextInt();
        }
        Arrays.sort(p);
        int half = p.length / 2;
        if (p[half - 1] == p[half]) {
            System.out.println("0");
        } else {
            System.out.println(p[half] - p[half -1]);
        }
    }
}