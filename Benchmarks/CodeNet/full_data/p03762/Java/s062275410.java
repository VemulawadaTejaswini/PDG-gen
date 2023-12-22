import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[]x=new int[n];
		int[]y=new int[m];
		for(int i=0;i<n;i++)x[i]=sc.nextInt();
		for(int i=0;i<m;i++)y[i]=sc.nextInt();
		
		long[] minSqare=new long[(n-1)*(m-1)];
		long ans=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i<j){
					int width=x[j]-x[i];
					for(int k=0;k<m;k++){
						for(int l=0;l<m;l++){
							if(k<l){
								int height=y[l]-y[k];
								ans+=width*height;
								ans=ans%(1000000000+7);
							}
						}
					}
				}
			}
		}
		System.out.println(ans);
	}

}
