import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int count = a.length();
      	
		System.out.println(count - a.replace("1","").length());
	}
}