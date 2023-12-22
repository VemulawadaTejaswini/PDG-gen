import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		sc.close();

		char res = 0;
		if(c[0]=='A')res='T';
		else if(c[0]=='T')res='A';
		else if(c[0]=='C')res='G';
		else if(c[0]=='G')res='C';

		System.out.println(res);
	}

}
