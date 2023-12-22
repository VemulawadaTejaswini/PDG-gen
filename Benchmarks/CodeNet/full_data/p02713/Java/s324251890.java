

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                for(int k = 1; k <= n; k++) {
                    result += euclid(j,euclid(k,i));
                }
            }
        }
        System.out.println(result);
    }

    private static int euclid(int m, int n) {
        int tmp;

        if(m < n) {
            tmp = m;
            m = n;
            n = tmp;
        }
        while(n > 0){
            tmp = m % n;
            m = n;
            n = tmp;
        }
        return m;
    }
}
