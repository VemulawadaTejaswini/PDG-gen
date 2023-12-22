import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		boolean prime[]=new boolean[100000];
		prime[0]=true;
		for(int i=1;i<100000;i++) {
			if(!prime[i]) {
				for(int j=1;j<Math.ceil(100000/(i+1));j++) {
					prime[(i+1)*(j+1)-1]=true;
				}
			}
		}

		Scanner scan=new Scanner(System.in);

		int q=scan.nextInt();

		int l[]=new int[q];
		int r[]=new int[q];

		for(int i=0;i<q;i++) {
			l[i]=scan.nextInt();
			r[i]=scan.nextInt();
		}

		int count[]=new int[q];

		for(int i=0;i<q;i++) {
			for(int j=l[i];j<r[i]+1;j+=2) {
				if((!(prime[j-1]))&&(!(prime[(j+1)/2-1]))) {
					count[i]++;
				}
			}
			System.out.println(count[i]);
		}
	}
}
