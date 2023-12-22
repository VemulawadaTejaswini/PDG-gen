import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int a[]=new int[n];
		int alr[]=new int[n];
		int m[]=new int[n*(n+1)/2];
		int count;
		int countm=0;

		for (int i=0; i<n;++i){
			a[i]= sc.nextInt();
			}

		for (int l=0;l<n;++l){
			for (int r=l;r<n;++r){
				count =0;
				for (int k=0;k<r-l+1;++k){
					alr[count]=a[l+k];
					++count;
				}
			m[countm]=centralnum(alr, count);
			++countm;
			}
		}

		System.out.println(centralnum(m,countm));

	}

	public static int centralnum(int a[], int b){
		int x,y;
		for(int i=0;i<b;++i){
			for (int j=b-2;j>=i;--j){
				x=Math.min(a[j], a[j+1]);
				y=Math.max(a[j], a[j+1]);
				a[j]=x;
				a[j+1]=y;
			}
		}

		return (a[b/2]);
	}

}