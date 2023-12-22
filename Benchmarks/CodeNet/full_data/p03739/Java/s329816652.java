import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
		}
		sc.close();
	
		int count = 0;
		int sum = a[0];
		if(sum==0){
			if(a[1]>0){
				sum=-1;
			}else{
				sum=1;
			}
			count++;
		}
		
		for(int i=1; i<N; i++){			
			int diff = checkSum(sum, sum+a[i]);
			count += Math.abs(diff);
			sum = sum+a[i]+diff;
		}
		
		System.out.println(count);

	}
	
	private static int checkSum(int a, int b){
		if ( a>0 && b>=0){
			return -(b+1);
		}else if( a<0 && b<=0){
			return -(b-1);
		}else{
			return 0;
		}
	}

}