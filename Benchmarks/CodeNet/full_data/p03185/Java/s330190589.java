import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        int n; long c;
        BufferedReader br =
                new BufferedReader (new InputStreamReader (System.in));
        String[] line1 = br.readLine().split(" ");
        n = Integer.parseInt(line1[0]);
        c = Long.parseLong(line1[1]);
        long[] h = new long[n];
        String[] line2 = br.readLine().split(" ");
        for(int i = 0; i < line2.length; i++){
            h[i] = Long.parseLong(line2[i]);
        }
        long[] result = new long[n];
        result[0] = 0;
        int k = n;
        for(int i = 1; i < n; i++){
            long min = result[i - 1] + (h[i] - h[i - 1]) * (h[i] - h[i - 1]) + c;
            if(i >= 2){
                for(int j = Math.max(0, i - k); j < i; j++) {
                    long temp = result[j] + (h[i] - h[j]) * (h[i] - h[j]) + c;
                    if(min > temp){
                        min = temp;
                    }
                }
            }
            result[i] = min;
        }
        System.out.println(result[n - 1]);
    }


}
