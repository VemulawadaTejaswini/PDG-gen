import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();
		Arrays.sort(a);

		int check=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(i!=j) {
					if(a[i]==a[j]) {
						check=1;
						break;
					}else {
						break;
					}
				}
			}
			if(check==1)break;
		}
		System.out.println((check==1)? "NO":"YES");
	}
}