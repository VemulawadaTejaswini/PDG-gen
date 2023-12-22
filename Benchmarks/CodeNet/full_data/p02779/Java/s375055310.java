import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        String[] str = br.readLine().split(" ",0);
        String b = "YES";
        out:
        for(int i = 0; i < n; i++){
            num[i] = Integer.parseInt(str[i]);
            for(int j = 0; j < i; j++){
                if(num[i] == num[j]){
                    b = "NO";
                    break out;
                }
            }
        }
        System.out.println(b);
    }
}