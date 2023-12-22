import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long r = Integer.parseInt(st.nextToken());
        long D = Integer.parseInt(st.nextToken());
        long x = Integer.parseInt(st.nextToken());
        for(int i=2001;i<=2010;i++){
            x = r*x-D;
            System.out.println(x);
        }

    }
}
