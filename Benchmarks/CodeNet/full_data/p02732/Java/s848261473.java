import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] lines = br.readLine().split(" ");
        int[] A = new int[N];
        int[] values = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(lines[i]);
            values[A[i]-1]++;
        }
        for(int i = 0; i < N; i++) {
            long result = 0;
            int x = A[i];
            for(int j = 0; j < N; j++) {
                if(j == x-1) {
                    result += ((values[j]-1) * (values[j]-2))/2;
                }else {
                    result += (values[j] * (values[j]-1))/2;
                }
            }
            out.println(result);
        }
        out.flush();
        out.close();
        br.close();
    }
}