public class Main {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		if(juge(a,c,d)) {
			System.out.println("Yes");
		}else if(juge(a,b,d)&&juge(b,c,d)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

	private static boolean juge(int a1, int a2, int d) {
		if((a1-a2)<=d) {
			return true;
		}else {
			return false;
		}
	}
}
