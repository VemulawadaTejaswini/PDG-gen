import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
   	public String lcs(String a, String b) {
        return lcs(a, 0, b, 0, "");
    }
    private String lcs(String a, int i, String b, int j, String soFar) {
       int n = a.length();
       int m = b.length();
       if (i >= n || j >= m) {
           return soFar;
       }
       if (a.charAt(i) == b.charAt(j)) {
           return lcs(a, i + 1, b, j + 1, soFar + a.charAt(i));
       } else {
           String x = lcs(a, i + 1, b, j, soFar);
           String y =lcs(a, i, b, j + 1, soFar);
           return x.length() >= y.length() ? x : y;
       }
    }
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String a = br.readLine();
            String b = br.readLine();
          	Main app = new Main();
            String result = app.lcs(a, b);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
