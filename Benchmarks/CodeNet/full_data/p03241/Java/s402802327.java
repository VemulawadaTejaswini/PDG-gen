import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	static int[] ans;
	static ArrayList<ArrayList<Integer>> ab;
	static HashMap<Integer, Integer> px = new HashMap<>(); 

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		sc.close();
		int a = m / n;
		for (i = a; i >= 1; i--) {
			if(m % i == 0) break;
		}
		out.println(i);
	}
}
