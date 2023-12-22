import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int A,B,min=100000;
		int Asum=0,Bsum=0;
		for(A=0;A<N;A++) {
			B=N-A;
			if(A>10000) {Asum+=(A%100000)/10000;}
			if(A>1000) {Asum+=(A%10000)/1000;}
			if(A>100) {Asum+=(A%1000)/100;}
			if(A>10) {Asum+=(A%100)/10;}
			Asum+=A%10;
			
			if(B>10000) {Bsum+=(B%100000)/10000;}
			
			if(B>1000) {Bsum+=(B%10000)/1000;}
			if(B>100) {Bsum+=(B%1000)/100;}
			if(B>10) {Bsum+=(B%100)/10;}
			Bsum+=B%10;
			if((Asum+Bsum)<min) {min=Asum+Bsum;}
		}
		System.out.print(min);
		//for(int i=0;i<3;i++) {

		//}
		}
	}
