
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rn-sshawish
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = 0, x = 0, y = 0;
        boolean state = true;
        for (int i = 0; i < n; i++) {
            int t1 = input.nextInt();
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int distanceDiff;
            if (x == 0 && y == 0 || x1 == 0 && y1 == 0) {
                distanceDiff = (Math.abs(x - x1)) + (Math.abs(y - y1));
            } else if (x == 0 && y != 0 || x1 == 0 && y1 != 0) {
                distanceDiff = (Math.abs(x - x1)) + (Math.abs(y - y1) + 1);
            } else if (x != 0 && y == 0 || x != 0 && y == 0) {
                distanceDiff = (Math.abs(x - x1) + 1) + (Math.abs(y - y1));
            } else {
                distanceDiff = (Math.abs(x - x1) + 1) + (Math.abs(y - y1) + 1);

            }
            int timeDiff = t1 - t;
            if (distanceDiff - timeDiff == 0) {
                t = t1;
                x = x1;
                y = y1;
            } else {
                state = false;
                break;
            }
        }
        if (state) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
