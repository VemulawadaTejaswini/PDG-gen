import java.io.IOException;

/**
 * Created by nikitos on 19.09.17.
 */
public class A {

    public static void main(String[] args) throws IOException {
        java.io.BufferedReader buf = new java.io.BufferedReader( new java.io.InputStreamReader(System.in));
        int n = Integer.parseInt(buf.readLine());
        int a = Integer.parseInt(buf.readLine());
        System.out.println(n*n-a);
    }

}