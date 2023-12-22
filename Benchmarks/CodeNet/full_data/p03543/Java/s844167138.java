import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 	String N = sc.nextLine();
    String[] num = N.split("");
    
    if(num[0].equals(num[1]) && num[1].equals(num[2])){
    	System.out.println("Yes");
    }else if(num[1].equals(num[2]) && num[2].equals(num[3])){
      	System.out.println("Yes");
    }else{
    	System.out.println("No");
    }
  }
}