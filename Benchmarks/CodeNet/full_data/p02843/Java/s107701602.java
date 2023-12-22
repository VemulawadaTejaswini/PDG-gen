import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int ans = main.solve();
        System.out.println(ans);
    }

    int solve() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<100) return 0;
        if(x%100==0) return 1;
        int n = x/100;
        return x%100 <= 5*n?1:0;
    }
}