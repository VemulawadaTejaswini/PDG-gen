import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int n = sc.nextInt();

		String tmp = sc2.nextLine();
		System.out.print(tmp);
		String[] a = tmp.split(" ",0);

		sc.close();
		sc2.close();

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) continue;
				if(a[i].equals(a[j])) {
					System.out.println("NO");
					return ;
				}
			}
		}

		System.out.println("YES");

	}

}