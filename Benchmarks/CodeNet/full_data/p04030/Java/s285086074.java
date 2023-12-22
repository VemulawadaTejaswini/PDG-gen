import java.util.*;


class Main{
  
      
  
  
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      
      String s = sc.next();
      StringBuilder ans = new StringBuilder();
      
      for(int i=0;i<s.length();i++){
      	if(s.charAt(i)=='0'){
        	ans.append('0');
        } else if(s.charAt(i)=='1'){
        	ans.append('1');
        } else {
          if(ans.length() > 0){
        	ans.deleteCharAt(ans.length()-1);
          }
        }
      }
      System.out.println(ans);
	}
}