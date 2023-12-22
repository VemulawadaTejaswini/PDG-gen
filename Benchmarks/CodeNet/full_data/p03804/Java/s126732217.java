import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		String[] a = new String[n];
		String[] b = new String[m];
		String x = "";
		String y = "";
		for (int i = 0; i < n; i++) {
			a[i] = scan.next();
			x = x + a[i];
		}
		for (int i = 0; i < m; i++) {
			b[i] = scan.next();
			y = y + b[i];
		}
		//System.out.println(x);
		List<Integer> index = new ArrayList<Integer>();

		for (int i = 0; i < m; i++) {
			if(x.indexOf(b[i])>=0) {
				index.add(x.indexOf(b[i]));
			}
			}

		//System.out.println(index);
//indexの中身が連番になっていればOK
		boolean hyozi =false;
		for(int i=0;i<index.size()-1;i++) {
			if(index.get(i)+1==index.get(i+1)) {
				hyozi =true;
			}else {
				hyozi = false;
			}
		}



		if (hyozi == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
