import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] s = S.toCharArray();
        String ans = "";
      
         for(int i = 0; i < s.length; i++){
           char temp = (char)(65+(s[i]+N+65)%26);
           ans += temp;
         }
       
         System.out.println(ans);
      
	}

}