import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
      String ans ="";	
      check(s);
      System.out.println(ans);

      
      
      /*
      for(int i=0;i<s.length();i++){
        //奇数番目の文字。iは奇数
        if(i%2==1){
          if(s.equals("R") OR s.equals("U") OR s.equals("D")){
            
          }
        }
        System.out.println("No");
      }
      */
	}
  public void check(String s){
         for(int i=0;i<s.length();i++){
        //奇数番目の文字。iは奇数
        if(i%2==1){
          if(s.equals("L")){
            ans="No";
          }else{
          	continue;
          }
        }else{
          if(s.equals("R")){
          	ans="No";
          }else{
          	continue;
          }
        }
        ans="Yes";
      }
      
}
