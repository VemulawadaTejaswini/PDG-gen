import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                int n = Integer.parseInt(line);
                String[] str = br.readLine().split(" ");
                int[] a = new int[n];
                for(int i=0;i<n;i++){
                    a[i] = Integer.parseInt(str[i]);
                }
                int[] l = new int[n];
                l[0] = a[0];
                int sum =0;
                for(int i=1; i<n; i++){
                    for(int j=0; j<=i; j++){
                        l[j] = l[j] + a[i];
                        if(l[j]==0) sum++;
                    }
                }
                System.out.println(sum);
            }
        }
    }
}