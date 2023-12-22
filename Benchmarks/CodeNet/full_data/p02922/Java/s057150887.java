public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int res = 1;
		for(int i=1;;i++) {
			int count;
			if(i <= 1) {
				count = i*a;
			}else {
				count = i * a - 1;
			}
			if(count >= b) {
				res = i;
				break;
			}

		}
		System.out.println(res);
	}
}