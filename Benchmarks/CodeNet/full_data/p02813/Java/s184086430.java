import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	boolean used[];
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> ans = new ArrayList<String>();
	int pi = 0;
	int qi = 0;
	String p="";
	String q="";
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		for(int i=0; i<n; i++) {
			p = p + sc.next();
		}
		for(int i=0; i<n; i++) {
			q = q + sc.next();
		}
		used = new boolean[n+1];
		calc(n, "");
		System.out.println(Math.abs(pi-qi));
		sc.close();
	}


	private void calc(int n, String s) {
		if(s.length()==n) {
			list.add(s);
			if(s.equals(p)) {
				pi=list.size();
			}
			if(s.equals(q)) {
				qi=list.size();
			}
			return;
		}
		for(int i=1; i<=n; i++) {
			if(!used[i]) {
				used[i]=true;
				calc(n, s + String.valueOf(i));
				used[i]=false;
			}
		}

	}
}
