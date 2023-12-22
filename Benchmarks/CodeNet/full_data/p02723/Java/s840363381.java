import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
   		String s = sc.nextLine();
      	if(s.substring(3,4).equals(s.substring(4,5)) 
           && s.substring(5,6).equals(s.substring(6,7)))
           System.out.println("Yes");
        else System.out.println("no");
    	
    }
}
