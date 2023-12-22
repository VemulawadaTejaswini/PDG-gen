import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		int[] a = new int[4];
		for (int i = 0; i < 4; i++) {
			a[i] = Integer.parseInt("" + ch[i]);
		}
		int tmp = 7 - a[0];
		if (a[1] + a[2] + a[3] == tmp) {
			System.out.println(a[0]+"+"+a[1]+"+"+a[2]+"+"+a[3]+"=7");
			return;
		} else if (a[1] + a[2] - a[3] == tmp) {
			System.out.println(a[0]+"+"+a[1]+"+"+a[2]+"-"+a[3]+"=7");
			return;
		} else if (a[1] - a[2] + a[3] == tmp) {
			System.out.println(a[0]+"+"+a[1]+"-"+a[2]+"+"+a[3]+"=7");
			return;
		} else if (a[1] - a[2] - a[3] == tmp) {
			System.out.println(a[0]+"+"+a[1]+"-"+a[2]+"-"+a[3]+"=7");
			return;
		} else if (-a[1] + a[2] + a[3] == tmp) {
			System.out.println(a[0]+"-"+a[1]+"+"+a[2]+"+"+a[3]+"=7");
			return;
		} else if (-a[1] + a[2] - a[3] == tmp) {
			System.out.println(a[0]+"-"+a[1]+"+"+a[2]+"-"+a[3]+"=7");
			return;
		} else if (-a[1] - a[2] + a[3] == tmp) {
			System.out.println(a[0]+"-"+a[1]+"-"+a[2]+"+"+a[3]+"=7");
			return;
		} else if (-a[1] - a[2] - a[3] == tmp) {
			System.out.println(a[0]+"-"+a[1]+"-"+a[2]+"-"+a[3]+"=7");
			return;
		}
	}
}
