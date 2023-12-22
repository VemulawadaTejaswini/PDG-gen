//Created by Aminul on 3/28/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int x = in.nextInt(), y = in.nextInt();
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
       
      	PriorityQueue<Integer> red = new PriorityQueue<>();
        PriorityQueue<Integer> blue = new PriorityQueue<>();
        PriorityQueue<Integer> colorless = new PriorityQueue<>(Collections.reverseOrder());
       
      	for (int i = 0; i < a; i++) {
            red.add(in.nextInt());
        }
        for (int i = 0; i < b; i++) {
            blue.add(in.nextInt());
        }
        for (int i = 0; i < c; i++) {
            colorless.add(in.nextInt());
        }

        while (red.size() > x) red.poll();
        while (blue.size() > y) blue.poll();

        while (!colorless.isEmpty()) {
            int val = colorless.poll();
            if (red.size() == x && blue.size() == y) {
                if (red.peek() <= blue.peek() && red.peek() < val) {
                    red.poll();
                    red.add(val);
                } else if (blue.peek() <= red.peek() && blue.peek() < val) {
                    blue.poll();
                    blue.add(val);
                }
            } else if (red.size() < x) {
                red.add(val);
            } else if (blue.size() < y) {
                blue.add(val);
            }
        }

        long res = 0;
        for (int redVal : red) res += redVal;
        for (int blueVal : blue) res += blueVal;
        pw.println(res);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}