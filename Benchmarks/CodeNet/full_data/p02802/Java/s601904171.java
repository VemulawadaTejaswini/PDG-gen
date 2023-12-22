//package Round613;

import java.util.Scanner;

/**
 * @author sguar <shugangcao@gmail.com>
 * welcome to kuaishou
 * Created on 2020-01-12
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n, m;
        n =  cin.nextInt();
        m = cin.nextInt();
        cin.nextLine();
        boolean []ac = new boolean[n + 1];
        int numberOfAc = 0, numberOfWa = 0;
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
                    numberOfWa++;
                }
            }
        }
        System.out.println(numberOfAc + " " + numberOfWa);
    }
}
