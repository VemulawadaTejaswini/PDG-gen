import java.util.Scanner;

class Main{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		char c[] = new char[n+2];

		String s = scan.next();
		scan.close();

		c[0] = 'E';
		c[n-1] = 'W';
		for(int i = 1; i <= n; i++)
			c[i] = s.charAt(i-1);

		int min = n,sum = 0;

		for(int i = 1; i <= n; i++){
			sum = 0;
			for(int j = 0; j < i; j++){
				if(c[j] == 'W')sum++;
			}
			for(int j = i + 1; j <= n; j++){
				if(c[j] == 'E')sum++;
			}
			if(min >= sum)min = sum;
		}
		System.out.print(min);
	}
}