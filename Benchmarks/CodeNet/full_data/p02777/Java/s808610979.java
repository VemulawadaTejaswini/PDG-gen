import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String p = kb.next();
		String q = kb.next();
		int i = kb.nextInt();
		int j = kb.nextInt();
		String r = kb.next();
		if (r.equals(p)) {
			i -= 1;
		} else if (r.equals(q)) {
			j -= 1;
		}
		System.out.println(i + " " + j);
		kb.close();
	}

}
