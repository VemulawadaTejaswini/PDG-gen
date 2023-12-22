import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] s_in = line.split(" ");
		System.out.println(Integer.parseInt(s_in[0]) + Integer.parseInt(s_in[1])/2);
	}
}