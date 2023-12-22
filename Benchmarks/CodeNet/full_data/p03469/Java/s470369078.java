import java.util.ArrayList;
import java.util.Scanner;

public class Katana {
	private int atk1;
	private int atk2;
	private boolean nageta;

	Katana(int atk1, int atk2) {
		this.atk1 = atk1;
		this.atk2 = atk2;
	}

	public int getAtk(boolean a) {
		if (a==false) {
			return this.atk1;
		} else {
			return this.atk2;
		}
	}

	public boolean getNageta() {
		return this.nageta;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = Integer.parseInt(str);
		str = scan.next();
		int h = Integer.parseInt(str);
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			str = scan.next();
			a[i] = Integer.parseInt(str);
			str = scan.next();
			b[i] = Integer.parseInt(str);
		}
		ArrayList<Katana> katana = new ArrayList<>();
		katanaSet(katana, a, b);
		int answer = 0;
		if (n==1) {
			if (b[0] > a[0]) {
				h=h-b[0];
				for (answer = 1; ; answer++) {
					if (h<=0) {
						break;
					}
					h=h-a[0];
				}
				
			} else {
				for (answer = 0; ; answer++) {
					if (h<=0) {
						break;
					}
					h=h-a[0];
				}
			}
		} else if (katana.get(max(katana, false)).getAtk(false)>=katana.get(max(katana, true)).getAtk(true)) {
			for (answer = 1; ; answer++) {
				if (h<=0) {
					break;
				}
				h=h-a[max(katana, false)];
			}
		} else {
			int atk = max(katana, false);
			katana.remove(atk);
			while (a[atk]<katana.get(max(katana, true)).getAtk(true) ) {
				if (a[atk]>=h || b[atk]>=h) {
					break;
				}
				h=h-katana.get(max(katana, true)).getAtk(true);
				katana.remove(katana.get(max(katana, true)));
				answer=answer+1;
				if (katana.size()==0) {
					break;
				}
			}
			if (a[atk]>=b[atk]) {
				for (answer = answer; ; answer++) {
					if (h<=0) {
						break;
					}
					h=h-a[atk];
				}
			} else {
				h=h-b[atk];
				for (answer = answer+1; ; answer++) {
					if (h<=0) {
						break;
					}
					h=h-a[atk];
				}
			}
		}

		System.out.println(answer);
	}

	public static void katanaSet(ArrayList<Katana> katana, int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			katana.add(new Katana(a[i], b[i]));
		}
	}

	public static int max(ArrayList<Katana> katana, boolean a) {
		int max = 0;

		for (int i = 1; i < katana.size(); i++) {
			if (katana.get(i).getAtk(a) > katana.get(max).getAtk(a)) {
				max = i;
			}
		}

		return max;
	}
}