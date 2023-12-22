import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] times = new int[n];
        int[] a = new int[n];
        long min = 999999999;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            while (a[i] % 2 == 0) {
                a[i] = a[i] / 2;
                times[i]++;
            }
           
            if (min > times[i]) {
                min = times[i];
            }
        }

        System.out.println(min);


    }
}




