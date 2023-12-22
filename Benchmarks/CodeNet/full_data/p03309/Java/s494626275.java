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
		int mannnaka1=(int)(heikin);
		int mannnaka2=(int)(heikin+1);
		int mannnaka3=(int)(heikin-1);

		long summary1=0;
		long summary2=0;
		long summary3=0;

		for(int i=0;i<n;i++) {
			summary1+=zettaichi(a[i]-mannnaka1);
			summary2+=zettaichi(a[i]-mannnaka2);
			summary3+=zettaichi(a[i]-mannnaka3);
		}


		if(summary1<summary2&&summary1<summary3) {
			System.out.print(summary1);
		}
		else {
			if(summary2<summary3) {
				System.out.print(summary2);
			}
			else {
				System.out.print(summary3);
			}
		}
	}

	public static int zettaichi(int a) {
		if(a>=0)
			return a;
		else
			return -a;
	}

}
