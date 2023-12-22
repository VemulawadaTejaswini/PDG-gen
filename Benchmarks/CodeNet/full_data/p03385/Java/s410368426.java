import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		s.append(sc.nextLine());
		System.out.println(new Problem(s).solve());
		sc.close();
	}
	
}
class Problem{
	StringBuilder s;
	
	public Problem(StringBuilder s) {
		this.s = s;
	}
	public String solve() {
		String result="no";
		
		if (s.toString().contains("a")
				&& s.toString().contains("b")
				&& s.toString().contains("c")) {
			result="yes";
		}	
		return result;
	}
}
