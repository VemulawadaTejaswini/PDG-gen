import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String ans = "No";
        
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                if(n == i * j){
                    ans = "Yes";
                    break;
                }
            }
        }
        
        out.println(ans);
        out.close();
        
    }
}