import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int G = sc.nextInt();

		int p[] = new int[D];
		int c[] = new int[D];
		int total = 0;
		int times[] = new int[D];
		double ave[] = new double[D];
		int next = 0;
		boolean worked = true;
		int totaltimes =0 ;

		for (int i=0; i<=D-1; ++i){
			p[i] = sc.nextInt();
			c[i] = sc.nextInt();
			total= total + (i+1)*100*p[i]+c[i];
			totaltimes= totaltimes + p[i];
		}


		for (int k=0;k<=D-1 && total-G>0 && worked == true;++k){

			next =0;
			worked = false;

			for (int i=0;i<=D-1-k; ++i){
				for (int j=1;( (total-G) >= (c[i]+(i+1)*(j)*100)) && j<=p[i] ; ++j){
					times[i]=j;
					worked = true;
				}
				if (times[next] < times[i]) next = i;
			}

			if (worked == true){
				total= total - (c[next]+(next+1)*100*times[next]);

				for (int i=next;i<=D-2;++i){
					p[i]=p[i+1];
					c[i]=c[i+1];
				}
				totaltimes = totaltimes - times[next];
			}

		}

		System.out.println(totaltimes);


	}
}