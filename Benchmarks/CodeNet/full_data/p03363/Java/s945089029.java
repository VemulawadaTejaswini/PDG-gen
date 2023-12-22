import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        long [] values = new long [n];
        for (int i = 0; i < n; i++) {
            if (i == 0){
                values[i] = Integer.parseInt(tokn.nextToken());
            }else{
                values[i] = values[ i - 1] + Integer.parseInt(tokn.nextToken());
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i +1; j < n; j++) {
                long sum =   values[j];
                if (i != 0){
                    sum -= values[i - 1];
                }
                if (sum == 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
