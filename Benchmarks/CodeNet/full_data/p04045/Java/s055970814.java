import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int hako[] = new int[k];
		int j=0;
		//hako[0] = sc.nextInt();
		for(int i=0;i<k;i++) {
			hako[i] = sc.nextInt();
		}

		s: for(j=n;j<=10000;j++) {
			for(int l=0;l<k;l++) {
				int h=0;
				int ans =j;
				if(ans/1000==hako[l]) {
					h=1;
				}
				ans-=(ans/1000)*1000;
				if(ans/100==hako[l]) {
					h=1;
				}
				ans-=(ans/100)*100;
				if(ans/10==hako[l]) {
					h=1;
				}
				ans-=(ans/10)*10;
				if(j/1==hako[l]) {
					h=1;
				}
				if(h==0) {
					break s;
				}

			}
		}

		System.out.println(j);
	}
}
