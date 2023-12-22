import java.util.*;
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int strLn =str.length();
      char strMin = str.charAt(0);
      char strMax = str.charAt(strLn-1);
      if(strMin==strMax && (strLn%2==0)){
        System.out.println("First");
      } else if(strMin != strMax && (strLn%2!=0)){
        System.out.println("First"); 
      }else{
         System.out.println("Second");
      }
	}
}