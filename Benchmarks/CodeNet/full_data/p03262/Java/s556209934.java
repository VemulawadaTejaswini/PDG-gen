import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int x[] = new int[n+1];

		boolean xxx=true;

		int min; int max;

		for (int i=1;i<=n;++i){
			x[i]=sc.nextInt();
		}

		int newx[]=new int[n+1];

		for (int i=0;i<n/2;++i){
			for (int j=n/2-1;j>i;--j){
				min = Math.min(x[j], x[j-1]);
				max = Math.max(x[j], x[j-1]);
				x[j-1]=min;
				x[j]=max;
			}

		}
		for (int i=n/2;i<n;++i){
			for (int j=n;j>i;--j){
				min = Math.min(x[j], x[j-1]);
				max = Math.max(x[j], x[j-1]);
				x[j-1]=min;
				x[j]=max;
			}

		}

		boolean count1b=true; boolean count2b =true;
		int count1=0; int count2=n/2;

		for (int i=0;i<=n;++i){
			if (count1b==true && count2b ==true){
			if (x[count1]<x[count2]){
				newx[i]=x[count1];
				if (count1 == 2/n-1) count1b=false;
				++count1;
			}
			else{
				newx[i]=x[count2];
				++count2;
				if(count2 == n)count2b=false;
			}
			}
			else{
				if (count1b==true){
					newx[i]=x[count1];
					++count2;
				}
				else{
					newx[i]=x[count2];
					++count2;
				}
			}

		}



		int common=x[1]-x[0];
		int a;
		int b;
		int c;

		for (int i=1;i<n;++i){
			a=Math.max(newx[i]-newx[i-1], newx[i+1]-newx[i]);
			b=Math.min(newx[i]-newx[i-1], newx[i+1]-newx[i]);
			while (b!=0&&(c=a%b)!=0){
				a=b;
				b=c;
			}
			common = Math.min(common, b);
		}

		System.out.println(common);

	}
}