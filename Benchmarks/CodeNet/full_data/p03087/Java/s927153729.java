import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String str = sc.next();
		
		int[][] quiz = new int[q][2];
		
		for (int i = 0; i < quiz.length; i++) {
			quiz[i][0] = sc.nextInt() - 1;
			quiz[i][1] = sc.nextInt();
		}
		
		char[] array = str.toCharArray();
		
		for (int i = 0; i < quiz.length; i++) {
			boolean ac = false;
			int count = 0;
			
			for (int j = quiz[i][0]; j < quiz[i][1]; j++) {
				if (array[j] == 'A') {
					ac = true;
				} else if (ac && array[j] == 'C') {
					count++;
					ac = false;
				}
			}
			
			System.out.println(count);
		}
	}
}
