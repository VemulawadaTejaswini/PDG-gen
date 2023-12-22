

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[sc.nextInt() - 1] = String.valueOf(i + 1);
        }
        System.out.println(StringUtils.join(Arrays.asList(a), " "));
    }
}
