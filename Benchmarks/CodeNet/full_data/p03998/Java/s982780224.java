import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] a = sc.nextLine().split("",0);
		String[] b = sc.nextLine().split("",0);
		String[] c = sc.nextLine().split("",0);
		int countA = a.length;
		int countB = b.length;
		int countC = c.length;
		String out = null;
		String player = "a";

		while(true){
		    if (player.equals("a")) {
		        if (countA == 0) {
		            out = "A";
		            break;
		        } else {
		            player = a[a.length - countA];
		            countA--;
		        }
		    } else if (player.equals("b")) {
		        if (countB == 0) {
		            out = "B";
		            break;
		        } else {
		            player = b[b.length - countB];
		            countB--;
		        }
		    } else {
		        if (countC == 0) {
		            out = "C";
		            break;
		        } else {
		            player = c[c.length - countC];
		            countC--;
		        }
		    }

		}

		System.out.println(out);
	}
}