import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[N];
        for(int n=0; n<N; n++) d[n]=sc.nextInt();
        Arrays.sort(d);
        int ABCmax = d[N/2-1];
        int ARCmin = d[N/2];
        System.out.println(Math.max(0, ARCmin - ABCmax));
    }
}