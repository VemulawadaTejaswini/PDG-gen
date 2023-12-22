
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int m = Integer.MAX_VALUE;
        for (int i = 0;i < n;++i){
            int k = sc.nextInt();
            int f = sc.nextInt();
            if(f > t)continue;
            if(m > k)m = k;
        }
        if(m == Integer.MAX_VALUE) System.out.println("TLE");
        else System.out.println(m);
    }




}


