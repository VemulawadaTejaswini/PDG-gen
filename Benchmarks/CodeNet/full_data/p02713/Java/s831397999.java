import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int k =scn.nextInt();
		long sum=0;
		for(int i=1;i<=k;i++){
			
			for(int j=1;j<=k;j++){
				int val = gcd(i,j);
				for(int m=1;m<=k;m++){
					int val2 = gcd(val,m);
					sum+=val2;
				}
			}
		}
		System.out.println(sum);

	}
	public static int gcd(int a ,int b){
		if(b==0){
			return a;
		}
		
		
		return gcd(b,a%b);
	}

}