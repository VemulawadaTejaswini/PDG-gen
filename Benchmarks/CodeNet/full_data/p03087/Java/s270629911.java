import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int q = stdIn.nextInt();
		String s = stdIn.next();
		String[] str;
		int[] l = new int[q];
		int[] r = new int[q];
		int count = 0;
		
		for (int i = 0; i < q; ++i) {
			l[i] = stdIn.nextInt();
			r[i] = stdIn.nextInt();
		}
		
		str = s.split("");
		
		for (int i = 0; i < q; ++i) {
			for (int j = l[i] - 1; j < r[i] - 1; ++j) {
				if (str[j].equals("A")) {
					if (str[j + 1].equals("C")) {
						++count;
					}
				}
			}
			System.out.println(count);
			count = 0;
		}
		
	}
}