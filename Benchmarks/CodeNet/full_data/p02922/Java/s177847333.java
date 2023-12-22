public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int res = 1;
		int count = 0;
		for(int i=1;;i++) {
			if(i <= 1) {
				count += a;
			}else {
				count += a - 1;
			}
			if(count >= b) {
				res = i;
				break;
			}

		}
		System.out.println(res);
	}
}