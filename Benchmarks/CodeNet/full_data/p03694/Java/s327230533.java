import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int a=0;
		int n=scan.nextInt();
		int val[]=new int[n];

		int kai=0;
		
		
		if(n>=1 && n<=100) {
		for(int i=0;i<n;i++){
			a=scan.nextInt();
			if(a>=0 && a<=1000) {
			val[i]=a;
			}
			else {
				
			}
		}
		
		int max=val[0];
		int min=val[0];

		for(int j=1;j<val.length;j++){
			
			if(min>val[j]) {
				min=val[j];
			}
			
			max=Math.max(max, val[j]);
			
		}

		kai=max-min;
		System.out.println(kai);

	}else{
		
	}
		
	}
}