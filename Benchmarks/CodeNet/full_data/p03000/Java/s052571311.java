import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		String line[] = sc.nextLine().split(" ");

		int n = Integer.parseInt(line[0]);
		int x = Integer.parseInt(line[1]);

		int height = 0;
		int cnt = 1;

		for(int i = 0; i < n; i++) {
			int l = sc.nextInt();

			height += l;

			if(height > x) {
				break;
			}
			cnt++;
		}

		sc.close();
		System.out.println(cnt);
	}
}
