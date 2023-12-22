import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int N = s.length();
    int count = 0;
    String s1;
    String s2;
    boolean frag=true;
    while(frag){
      	frag = false;
      	if(N <= 1){
          break;
        }
      	if(N == 2){
          if(s.charAt(0) == s.charAt(1)){
            count+=2;
          }
          break;
        }
    	for(int i=0; i<N; i++){
     		if(s.charAt(i)==s.charAt(i+1)){
              if(i==0){
                s=s.substring(2);
              }else{
                s1 = s.substring(0, i);
        		s2 = s.substring(i+2);
        		s = s1 + s2;
              }
        		count += 2;
        		N -= 2;
              frag = ture;
              	break;
      		}
    	}
    }
    System.out.println(count);
  }
}
