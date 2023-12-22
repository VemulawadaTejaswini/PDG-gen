import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
 public class Main {
   public static void main(String[] args) throws IOException {
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(in.readLine());
     StringTokenizer stk = new StringTokenizer(in.readLine());
     in.close();
     char[] s = stk.nextToken().toCharArray();
     int abc_cnt = 0;
     for (int i=0; i<n-2; i++){
       if(s[i] == 'A' && s[i+1] == 'B' && s[i+2] == 'C')
         abc_cnt++;
     }
     System.out.println(abc_cnt);
   }
 }