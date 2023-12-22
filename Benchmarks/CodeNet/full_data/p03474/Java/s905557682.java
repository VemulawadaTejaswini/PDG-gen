import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
      //取得
	  int A = sc.nextInt();
      int B = sc.nextInt();
      String S = sc.next();
      
      Pattern p = Pattern.compile("^[0-9]{"+A+"}-[0-9]{"+B+"}$");
      Matcher m = p.matcher(S);
      
      if(m.matches()){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}