import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int start=n/4;
		if(start==0){start=1;}
		int nn=3*n/4;
		int max=3500;
		int end=0;
		for(int i=start;end==0&&i<=max;i++){
			for(int j=i;end==0&&j<=max;j++){
				for(int k=(j<=nn)?nn:j;k<=max;k++){
					if(4*i*j*k==n*(i*j+j*k+k*i)){
						System.out.println(i+" "+j+" "+k);
						end=1;
						break;
					}
				}
			}
		}
	}
}