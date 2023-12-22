import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long counter =0;

		int big = (int) Math.log10(n);


		for(int i = 1;i<10;i++) {
			for(int j=1;j<10;j++) {
				int a = 0;
				int b = 0;
				if(i==j&&i<=n) {
					a++;
					b++;
				}
				for(int k = 0;k<big-1;k++) {
					a+=Math.pow(10,k);
					b+=Math.pow(10,k);
				}
				int aa = (int) (i*Math.pow(10, big)+j);
				
				if(n-aa>=0) {
					a++;
					int niner = 0;
					for(int k =1;k<big;k++) {
						niner += (int) (9*Math.pow(10,k));
					}
					if(n>=niner+aa) {
						a+=niner/10;
					}else {
						a+=(n-aa)/10;
					}
				}

				int bb = (int) (j*Math.pow(10, big)+i);
				if(n-bb>=0) {
					b++;
					int niner = 0;
					for(int k =1;k<big;k++) {
						niner += (int) (9*Math.pow(10,k));
					}
					if(n>=niner+bb) {
						b+=niner/10;
					}else {
						b+=(n-bb)/10;
					}
				}
				counter+=(long)a*b;
				//if(i!=j)counter+=(long)a*b;
			}
		}


		System.out.println(counter);

	}

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
