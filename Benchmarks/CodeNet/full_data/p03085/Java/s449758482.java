import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 String a = sc.next();

		 if(a.equals("A")){
			 System.out.println("T");
		 }
		 else if(a.equals("T")){
			 System.out.println("A");
		 }
		 else if(a.equals("G")){
			 System.out.println("C");
		 }
		 else if(a.equals("C")){
			 System.out.println("G");
		 }
	}
}