package jp.AtCoder.seto_42;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a {

    public static void main(String[] args) {

        int f = 2;
        int s = 1;
        int i;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            for (int j = 0; j < 3; j++) {
                i = Integer.parseUnsignedInt(br.readLine());
                if (i == 5) {
                    --f;
                } else if (i == 7) {
                    --s;
                }
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("NO");
        }
        if (f == 0 && s == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}