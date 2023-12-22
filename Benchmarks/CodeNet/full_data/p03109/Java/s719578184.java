import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String T = S.replace("/","");
      int U = Integer.parseInt(T);
      if(U<=20190430){
        System.out.println("Heisei");
      }else{
        System.out.println("TBD");
      }
    }
}