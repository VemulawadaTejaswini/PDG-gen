import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] str = stdR.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int d = Integer.parseInt(str[2]);
        double colx = n;
        int diff = 1;
        while(diff <= d) {
            colx =  (n - diff) * 2;
            diff++;
        }
        colx = colx / ((long)n * n);
        System.out.println(colx * (m - 1));
    }
}