import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double N = scan.nextDouble();
		double x = scan.nextDouble();
		double a[] = new double[(int)N];
		for(int i=0;i<N;i++){
			a[i] = scan.nextDouble();
		}
		double aa[] = new double[(int)N];
		for(int i=0;i<N;i++){
			if(i==0){
				aa[i] = Math.min(a[i], a[(int)N-1]+x);
			}else{
				aa[i] = Math.min(a[i], aa[i-1]+x);
			}
		}
		int count = 0;
		for(int i=0;i<N;i++){
			if(i==0){
				aa[i] = Math.min(aa[i], aa[(int)N-1]+x);
				if(aa[i]==a[(int)N-1]+x){
					count++;
				}
			}else{
				aa[i] = Math.min(aa[i], aa[i-1]+x);
				if(aa[i]==a[i-1]+x){
					count++;
					if(i-1==0){
						count--;
					}
				}
			}
		}
		int output = 0;
		for(int i=0;i<N;i++){
			output += (int)aa[i];
			//System.out.println((int)aa[i]);
		}
		System.out.println((int)(output-count*x));

	}
}