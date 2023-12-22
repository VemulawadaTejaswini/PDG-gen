import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String t = sc.next();
      int cnt = 0;
      int x = -1;
      for(int i = 0;i < s.length();i++){
      	for(int j = 0;j < t.length()&&i+j<s.length();j++){
        	if(s.substring(j+i,j+i+1).equals("?")||s.substring(j+i,j+i+1).equals(t.substring(j,j+1)))cnt++;
        }
        if(cnt==t.length())x = i;
        cnt = 0;
      }
      if(x==-1){
      	System.out.println("UNRESTORABLE");
        return;
      }
      String first = "";
      String last = "";
      if(x>=1)first = s.substring(0,x);
      if(x+t.length()+1<=s.length()-1)last = s.substring(x+t.length()+1,s.length());
      StringBuilder sb = new StringBuilder();
      for(int i = 0;i < first.length();i++){
      	if(first.substring(i,i+1).equals("?"))sb.append("a");
        else sb.append(first.substring(i,i+1));
      }
      sb.append(t);
      for(int i = 0;i < last.length();i++){
      	if(last.substring(i,i+1).equals("?"))sb.append("a");
        else sb.append(last.substring(i,i+1));
      }
      System.out.println(sb.toString());
    }
}