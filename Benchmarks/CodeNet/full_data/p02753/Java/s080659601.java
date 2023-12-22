import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int cnt1 = 0;
      int cnt2 = 0;
      for(int i = 0;i<s.length();i++){
         if(s.charAt(i)=='A'){
            cnt1++;
         }
         if(s.charAt(i)=='B'){
            cnt2++;
         }
      }
      if(cnt1>=1&&cnt2>=1){
          System.out.println("Yes");
       }else{
           System.out.println("No");
       }         
	}
}
