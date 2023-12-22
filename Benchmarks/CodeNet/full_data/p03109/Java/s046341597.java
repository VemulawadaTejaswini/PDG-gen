import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		String s = sc.next();
        if(s.substring(5,7).equals("01")||s.substring(5,7).equals("02")||
           s.substring(5,7).equals("03")||s.substring(5,7).equals("04")){
          System.out.println("Heisei");}
      else{System.out.println("TBD");}		
	}
}