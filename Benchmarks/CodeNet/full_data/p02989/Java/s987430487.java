import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       int n = sc.nextInt();
       int[] d = new int[n];
       for (int i = 0; i < n; i++) {
           d[i] = sc.nextInt();
       }
       int ans = 0;
       Arrays.sort(d);
       int b = d[n/2];
       int c = d[n/2 - 1];
       System.out.println(b-c);
    }

}
