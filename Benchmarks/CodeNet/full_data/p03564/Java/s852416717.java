package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int K = cin.nextInt();
        int ans = 1;

        for(int i = 0; i < N; i++){
            int ans_1 = ans * 2;
            int ans_2 = ans + K;
            if(ans_1 >= ans_2)
                ans = ans_2;
            else if(ans_2 >= ans_1)
                ans = ans_1;
        }

        System.out.println(ans);

        cin.close();
    }
}