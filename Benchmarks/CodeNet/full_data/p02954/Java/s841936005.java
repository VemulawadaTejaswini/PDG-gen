import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            if (s.charAt(i) == 'R') {
                for (int j = i+1; j < n; j++) {
                    if (s.charAt(j) == 'L') {
                        if ((j-i) % 2 == 0) {
                            ans[j]++;
                        } else {
                            ans[j-1]++;
                        }
                        break;
                    }
                }
            } else {
                for (int j = i-1; j >= 0; j--) {
                    if (s.charAt(j) == 'R') {
                        if ((i-j) % 2 == 0) {
                            ans[j]++;
                        } else {
                            ans[j+1]++;
                        }
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < n-1; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println(ans[n-1]);
    }
}
