import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

private static class Maino {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
//        br.readLine();
        int b = Integer.parseInt(br.readLine());
        br.close();
        if( a > 9 || b > 9) System.out.println(-1);
        else System.out.println(a+b);
    }
}