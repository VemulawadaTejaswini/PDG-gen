import java.util.*;

class Main{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	
      String s = sc.next();
      char[] ss = s.toCharArray();
      
      int n = 0;
      for(int i=0;i<s.length();i++){
        	if(i%2 == 0){
              if(ss[i] == 'L'){
                n++;
              }
            } else {
				if(ss[i] == 'R'){
                	n++;
                }            
            }
      }
      
      if(n == 0){
         System.out.println("Yes");
      } else {
        System.out.println("No");
      }
	}
}