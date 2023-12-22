import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] Args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p, q, r;
        p = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        if(p + q <= r + q && p + q <= p + r){
            System.out.println(p + q);
        }
        else if(p + r <= p + q && p + r <= r + q){
            System.out.println(p + r);
        }
        else if(r + q <= p + q && r + q <= p + r){
            System.out.println(r + q);
        }

        br.close();
    }
}
