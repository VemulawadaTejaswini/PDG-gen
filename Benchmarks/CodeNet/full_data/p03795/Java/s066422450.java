import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get a integer
		int N = sc.nextInt();
		return N*800 - 200*(N/15);
	}
}