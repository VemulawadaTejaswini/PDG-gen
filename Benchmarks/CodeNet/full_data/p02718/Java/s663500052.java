
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

 public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in[] = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        in = br.readLine().split(" ");
        int arr[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(in[i]);
            sum+=arr[i];
        }
        int count=0;
        sum/=(4*m);
        for(int i=0;i<n;i++){
            if(arr[i]>=sum){
                count++;
            }
        }
        if(count>=m) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
