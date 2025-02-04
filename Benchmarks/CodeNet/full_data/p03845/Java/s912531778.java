import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int sum=0;
        int[] time = new int[n];
        for(int i=0; i<str.length; i++){
            time[i] = Integer.parseInt(str[i]);
            sum += time[i];
        }

        int m = Integer.parseInt(br.readLine());
        for(int i=0; i<m; i++){
            str = br.readLine().split(" ");
            int idx = Integer.parseInt(str[0]);
            int effect = Integer.parseInt(str[1]);

            System.out.println(sum - time[idx-1] + effect);
        }
    }
}
