import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    	String x = sc.next();
     	
      if(x.charAt(0) == x.charAt(1) && x.charAt(1) == x.charAt(2)){
	    System.out.println("No");
      }else{
	    System.out.println("Yes");
      }
      }
}
