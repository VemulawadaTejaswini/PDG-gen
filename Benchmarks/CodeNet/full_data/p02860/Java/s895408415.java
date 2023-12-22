import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String ans = "No";
        
        label:
        while(true){
            for(int i = 0; i < s.length() / 2; i++){
                if(s.charAt(i) != s.charAt(s.length() / 2 + i)){
                    break label;
                }else{
                    continue;
                }
            }
            ans = "Yes";
            break;
        }
        
        if(s.length() == 1){
            ans = "No";
        }
        
        out.println(ans);
        out.close();
        
    }
}