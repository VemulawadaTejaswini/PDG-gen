import java.util.Scanner;
public class maiｎ {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

		 String b = scan.next();

		 if(b == "A") {
			 System.out.println("T");
		 }else if( b == "T"){
			 System.out.println("A");
		 }else if( b == "G"){
			 System.out.println("C");
		 }else if(b == "C") {
			 System.out.println("G");
		 }

	}

}
