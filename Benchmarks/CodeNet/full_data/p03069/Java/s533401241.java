import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, j;
		int count = 0;
		n = sc.nextInt();
		char[] sArray = sc.next().toCharArray();

		for(j = 0; j < n - 1; j++) {
			for(i = 0; i < n - 1; i++) {
				if(sArray[i] == '#') {
					if(sArray[i + 1] == '.') {
					    count++;
					    sArray[i] = '.';
					    sArray[i + 1] = '#';
					}
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}