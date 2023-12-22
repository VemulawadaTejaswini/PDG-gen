import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];
    long start = 0;
    long last = 0;
    long both = 0;
    long cnt = 0;
    for(int i = 0;i < n;i++){
      s[i]=sc.next();
      for(int j = 0;j < s[i].length();j++)
        if(s[i].substring(j,j+1).equals("AB"))cnt++;
      if(s[i].charAt(0)=='B'&&s[i].charAt(s[i].length()-1)=='A')both++;
      else if(s[i].charAt(0)=='B')start++;
      else if(s[i].charAt(s[i].length()-1)=='A')last++;
    }
    if(both==0)cnt+=Math.min(last,start);
    else if(start+last==0)cnt+=both-1;
    else if(start+last>0)cnt+=both+Math.min(start,last);
    System.out.println(cnt);
  }
}
