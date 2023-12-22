import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            A[i] = Integer.parseInt(input[i]);
        }
        long[] array = new long[n];
        long ans = 0;
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += A[i];
            array[i] = sum;
            if(sum == 0)    ans++;
        }

        if(array[0] == 0)   ans++;
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i-1; j++){
                if(array[i] - array[j] == 0)    ans++;
            }
        }

        System.out.println(ans);
    }
}