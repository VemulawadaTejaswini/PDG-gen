import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String a = S.substring(2,3);
      String b = S.substring(3,4);
      String c = S.substring(4,5);
      String d = S.substring(5,6);
      if(a.equals(b)&&c.equals(d)){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}