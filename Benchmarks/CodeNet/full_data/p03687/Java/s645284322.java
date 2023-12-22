import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int cnt = 0;
      int f = 1;
      int min = 10000;
      if(s.length()==1){
      	System.out.println(0);
        return;
      }
      for(char c = 'a';c <= 'z';c++){
        String t = s;
      	while(true){
          StringBuilder sb = new StringBuilder();
          f = 0;
          for(int i = 0;i < t.length()-1;i++){
        	if(t.charAt(i)==c)sb.append(c);
            else if(t.charAt(i+1)==c)sb.append(c);
            else{
              sb.append(t.charAt(i));
              f++;
            }
          }
          cnt++;
          t = sb.toString();
          if(f==0){
          	min = Math.min(min,cnt);
            cnt = 0;
            break;
          }
        }
      }
      System.out.println(min);
    }
}