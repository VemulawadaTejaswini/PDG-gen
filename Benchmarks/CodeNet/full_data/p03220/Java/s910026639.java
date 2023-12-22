import java.util.Scanner;

class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		float T=(float)(sc.nextInt());
		float A=(float)(sc.nextInt());
		float[] unko=new float[N];
		for(int i=0; i<N; i++) {
			unko[i]=(float)(sc.nextInt());
		}
		double[] sa=new double[N];
		for(int i=0; i<N; i++) {
			sa[i]=Math.abs(T-unko[i]*0.006-A);
		}

		int a=0;
		double min=114514810;

		for(int i=0; i<N; i++) {
			//System.out.println(i+" "+sa[i]);
			if(min>sa[i]) {
				min=sa[i];
				a=i;
			}
		}
		System.out.println(a+1);
	}
}