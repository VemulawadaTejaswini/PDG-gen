import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		long sum=0;
		for(int i=1;i<n+1;i++) {
			a[i-1]=sc.nextInt()-i;
			sum+=a[i-1];;
		}

		double heikin=sum/n;
		int mannnaka[]=new int[11];
		long summary[]=new long[11];
		for(int i=0;i<11;i++) {
			mannnaka[i]=(int)heikin+i-5;
			summary[i]=0;
		}


		for(int i=0;i<n;i++) {
			for(int j=0;j<11;j++) {
				summary[j]+=zettaichi(a[i]-mannnaka[j]);
			}
		}
		long min=summary[0];
		for(int i=1;i<11;i++) {
			if(min>summary[i]) {
				min=summary[i];
			}
		}

		System.out.print(min);
	}



	public static int zettaichi(int a) {
		if(a>=0)
			return a;
		else
			return -a;
	}

}
