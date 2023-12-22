import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<Integer> set = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		//CODEFESTIVAL2016
		System.out.println(Main.minIteration(a));
	}
	
	static int minIteration(String str) {
		int len = str.length();
		int count = 0;
		StringBuilder s = new StringBuilder("CODEFESTIVAL2016");
		
		for (int i = 0; i < len; i++) {
			if ( str.charAt(i) != s.charAt(i))
				count++;
		}
		return count;
	}

}