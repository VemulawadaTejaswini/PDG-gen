import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        sc.nextLine();
        int[] L  = toArray(sc.nextLine());
        int res = 0;
        for (int i = 0; i < n; i++) {
            int a = L[i];
            for (int j = i+1; j < n; j++) {
                int b = L[j];
                for (int k = j+1; k < n; k++) {
                    int c = L[k];
                    if(a+b > c && a+c > b && b+c > a) res++;
                }
            }
        }
        System.out.println(res);
    }
}
