import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		double sum=0;
		for(int i=0;i<N;i++) {
			double x=sc.nextDouble();
			String u=sc.next();
			if(u.equals("JPY")) {
				sum+=x;
			}else {
				sum+=x*380000.;
			}
		}
		// 出力
		System.out.println(sum);
	}
}