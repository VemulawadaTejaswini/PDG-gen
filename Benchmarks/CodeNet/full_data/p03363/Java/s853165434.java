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
                int sum =0;
                for(int i=0; i<n; i++){
                    int[] s = new int[n];
                    for(int j=i; j<n; j++){
                        if(j==i){
                            s[j] = a[i];
                        }else{
                            s[j] = s[j-1]+a[j];
                        }
                        if(s[j]==0) sum++;
                    }
                }
                System.out.println(sum);
            }
        }
    }
}