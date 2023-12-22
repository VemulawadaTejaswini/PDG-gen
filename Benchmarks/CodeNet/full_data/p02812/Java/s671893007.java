import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

 public class Main {
   public static void main(String[] args) throws IOException {
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(in.readLine());
     StringTokenizer stk = new StringTokenizer(in.readLine());
     String s = stk.nextToken();  
     int cnt = 0;
     for (int i = 0; i < s.length(); i++){
       if((s.charAt(i) == 'A'&&s.charAt(i+1) == 'B') && s.charAt(i+2) =='C')
         cnt++;
     }
     System.out.println(cnt);
   }
 }