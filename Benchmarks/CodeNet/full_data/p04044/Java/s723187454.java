

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        String [] str = new String[N];

        for(int i = 0; i < N; i++) {
            str[i] = sc.next();
        }

        Arrays.sort(str);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            sb.append(str[i]);
        }

        System.out.println(sb.toString());
    }
}
