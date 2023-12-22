import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int q = in.nextInt();
		StringBuffer str = new StringBuffer(s);
		boolean hanten =false;
		for (int i = 0; i < q; i++) {
			int t = in.nextInt();
			if (t == 1) {
				hanten = !hanten;
			} else {
				int f = in.nextInt();
				String c = in.next();
				if(!hanten){
					if (f == 1) {
						str.insert(0,c);
					} else {
						str.append(c);
					}
				} else {
					if (f == 1) {
						str.append(c);
					} else {
						str.insert(0,c);
					}
				}
			}
		}
		if(hanten){
			str.reverse();
		}
		System.out.println(str);
	}
}
