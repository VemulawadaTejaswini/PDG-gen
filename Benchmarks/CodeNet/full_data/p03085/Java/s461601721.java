import java.util.*;
 
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		String ans = "";
		if (b == "A") {
			ans = "T";
		}
		else if (b == "T") {
			ans = "A";
		}
		else if (b == "C") {
			ans = "G";
		}
		else if (b == "G") {
			ans = "C";
		}
    System.out.println(ans);
  }
}