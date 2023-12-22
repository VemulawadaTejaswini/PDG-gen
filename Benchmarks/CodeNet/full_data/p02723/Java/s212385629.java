import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	// "abc"という文字列
	String a=scanner.next();

	 String str3 = String.valueOf(a.charAt(2));
	    String str4 = String.valueOf(a.charAt(3));
	    String str5 = String.valueOf(a.charAt(4));
	    String str6 = String.valueOf(a.charAt(5));
	    if(str3.equals(str4) && str5.equals(str6)){
	    		System.out.println("Yes");
	    }
	    else {
	    	System.out.println("No");
	    }

	}
}