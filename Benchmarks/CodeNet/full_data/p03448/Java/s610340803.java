import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int ans = 0;
        
        for(int i = 0; i <= a; i++){
            for(int j = 0; j <= b; j++){
                for(int k = 0; k <= c; k++){
                    if(x == 500 * i + 100 * j + 50 * k){
                        ans++;
                    }
                }
            }
        }
        
        out.println(ans);
        out.close();
        
    }
}