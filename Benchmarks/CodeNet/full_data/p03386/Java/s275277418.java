import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int K=sc.nextInt();
		int a[]=new int [B-A+1];
		for(int i=0;i<B-A+1;i++) {
			a[i]=A+i;
		}
		if(K*2>=B-A+1) {
			for(int i=0;i<B-A+1;i++) {
				System.out.println(a[i]);
			}
		}else {
			for(int i=0;i<K;i++) {
				System.out.println(a[i]);
			}
			for(int i=B-A+1-K;i<B-A+1;i++) {
				System.out.println(a[i]);
			}
		}
	}
}