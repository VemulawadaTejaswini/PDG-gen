//package Round613;

import java.util.Scanner;

/**
 * @author sguar <shugangcao@gmail.com>
 * welcome to kuaishou
 * Created on 2020-01-12
 */
public class Main {
    boolean []ac;
    int [] wa;
    public void run() {
        Scanner cin = new Scanner(System.in);
        int n, m;
        n =  cin.nextInt();
        m = cin.nextInt();
        cin.nextLine();
        ac = new boolean[n + 1];
        wa = new int[n + 1];
        int numberOfAc = 0;
        int numberOfWa = 0;
        for (int i = 0; i < m; i++) {
            int problem = cin.nextInt();
            String answer = cin.nextLine();
            if (answer.charAt(1) == 'A') {
                if (!ac[problem]) {
                    numberOfAc++;
                    ac[problem] = true;
                }
            } else {
                if (!ac[problem]) {
                    wa[problem]++;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (ac[i]) numberOfWa += wa[i];
        }
        System.out.println(numberOfAc + " " + numberOfWa);
    }
    public static void main(String[] args) {
       new Main().run();
    }
}
