import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double a[] = new double [N];
		for(int i = 0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		double sum=0;
		for(int j= 0;j<N;j++) {
			sum+=1/a[j];
		}
		System.out.println(1/sum);

	}

}
