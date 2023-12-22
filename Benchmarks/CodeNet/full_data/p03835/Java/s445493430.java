import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int k=scan.nextInt();
		int s=scan.nextInt();
		scan.close();

		int cnt=0;
		for(int i=0;i<=k;i++) {
			if(i<=s) {
				for(int j=0;j<=k;j++) {
					if(i+j<=s) {
						for(int l=0;l<=k;l++) {
							if(i+j+l==s) {
								cnt++;
							}
						}
					}
				}
			}
		}

		System.out.println(cnt);

	}

}