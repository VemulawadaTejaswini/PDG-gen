import java.util.*;
 
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		String ans = "";
		if (b.equals("A")) {
			ans = "T";
		}
		else if (b.equals("T")) {
			ans = "A";
		}
		else if (b.equals("C")) {
			ans = "G";
		}
		else if (b.equals("G")) {
			ans = "C";
		}
    System.out.println(ans);
  }
}