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

		s: for(j=n;j<=10000;) {
			for(int l=0;l<k;l++) {
				int h=0;
				
				if(j/1000==hako[l]) {
					j+=1000;
					h=1;
				}
				if(j/100==hako[l]) {
					j+=100;
					h=1;
				}
				if(j/10==hako[l]) {
					j+=10;
					h=1;
				}
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
