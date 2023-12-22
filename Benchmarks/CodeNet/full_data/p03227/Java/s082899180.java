import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		StringBuilder s = new StringBuilder(sc.next());
		if(s.length() != 2)s.reverse();
		System.out.println(s);
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
