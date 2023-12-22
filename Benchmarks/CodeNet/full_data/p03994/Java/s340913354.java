import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      char[] s = sc.next().toCharArray();
      int k = sc.nextInt();
      int n = s.length;
      for(int i = 0;i < n;i++){
      	if(s[i]!='a'&&k>='z'-s[i]+1){
          k-='z'-s[i]+1;
          s[i]='a';
        }
      }
      k = (26+k-'z'+s[n-1])%26;
      if(k==0)s[n-1]='z';
      else s[n-1]=(char)(k+'a'-1);
      System.out.println(s);
    }
}