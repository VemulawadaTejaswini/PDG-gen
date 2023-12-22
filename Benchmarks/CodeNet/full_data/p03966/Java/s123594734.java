import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int t_pre = 1, a_pre = 1;
        for(int i=0; i<n; i++){
            String[] str = br.readLine().split(" ");
            int t = Integer.parseInt(str[0]);
            int a = Integer.parseInt(str[1]);

            int rate = (int)Math.ceil(Math.max((double)t_pre/t, (double)a_pre/a));
            t_pre = rate * t;
            a_pre = rate * a;
        }
        System.out.println(t_pre + a_pre);
    }
}
