import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		boolean f = false;
		for(int i=0; i<n.length(); i++) {
			if(n.charAt(i) == '7') {
				f=true;
			}
		}
		if(f) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}


}
