import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();

		int i = 0;
		int c = 0;
		while(i < n) {
			while(s[i] != 'A' && i < n-2) {
				i++;
			}

			if(i >= n-2)
				break;

			if(s[i+1] == 'B' && s[i+2] == 'C') {
				c++;
			}
			i++;
		}

		System.out.println(c);
        return;
    }


}
