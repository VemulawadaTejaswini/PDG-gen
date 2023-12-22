import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		int a = 0;
		int r = 0;
		int c = 0;
		int h = 0;
		
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			if(s.startsWith("M")){
				list.add(s);
				m++;
			}else if(s.startsWith("A")) {
				list.add(s);
				a++;
			}else if(s.startsWith("R")) {
				list.add(s);
				r++;
			}else if(s.startsWith("C")) {
				list.add(s);
				c++;
			}else if(s.startsWith("H")) {
				list.add(s);
				h++;
			}
		}
		sc.close();
		int l = 5;
		if (m == 0) l--;
		if (a == 0) l--;
		if (r == 0) l--;
		if (c == 0) l--;
		if (h == 0) l--;
		long k;
		switch (l) {
		case 5:
			k = 10;
			break;
		case 4:
			k = 4;
			break;
		case 3:
			k = 1;
			break;
		default:
			k = 0;
			break;
		}
		
		k *= Math.max(m, 1)*Math.max(a, 1)*Math.max(r, 1)*Math.max(c, 1)*Math.max(h, 1);
		System.out.println(k);
	}

}
