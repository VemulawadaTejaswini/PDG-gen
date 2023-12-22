import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] lineString = br.readLine().split(" ");
        int N = Integer.valueOf(lineString[0]);
        int K = Integer.valueOf(lineString[1]);
        
        String[] lazhu = br.readLine().split(" ");
        int[] l = new int[N];

        for (int i = 0; i < N; i++) {
            l[i] = Integer.parseInt(lazhu[i]);
        }
        
        int sum = 0;
        int temp = 0;
        int pos = 0;
        for (int i = 0; i < N ; i++) {
            pos = i + K - 1;
            if (pos >= N) {
                continue;
            }
            if (l[i] >= 0) {
                sum = l[pos];
            } else if (l[pos] <= 0) {
                sum = Math.abs(l[i]);
            } else {
                if (Math.abs(l[i]) < l[pos]) {
                    sum = Math.abs(l[i]) * 2 + l[pos];
                } else {
                    sum = Math.abs(l[i]) + 2 * l[pos];
                }
            }
            if (temp > sum || temp == 0) {
                temp = sum;
            }
            
        }
        System.out.println(temp);
    }
}

