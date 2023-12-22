import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        int blue = Integer.parseInt(s.nextToken());
        int red = Integer.parseInt(s.nextToken());
        int totalBlue = blue;
        int totalRed = red;
        while (n > totalBlue + totalRed) {
            if (blue + totalBlue + totalRed > n)
                totalBlue += (n - (totalBlue + totalRed));
            else
                totalBlue += blue;
            if (red + totalBlue + totalRed > n)
                totalRed += (n - (totalBlue + totalRed));
            else
                totalRed += red;
        }
        if (totalBlue + totalRed <= n) System.out.println(totalBlue);
        else if (n >= totalBlue) System.out.println(totalBlue);
        else System.out.println(n);
    }
}