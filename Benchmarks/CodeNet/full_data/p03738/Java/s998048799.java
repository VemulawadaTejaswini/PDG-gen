import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a= sc.next();
    String b= sc.next();
    
    if (b.compareTo(a) < 0) {
			System.out.println("GREATER");
		} else if (b.compareTo(a) == 0) {
			System.out.println("EQUAL");
		} else {
			System.out.println("LESS");
		}
	}
}