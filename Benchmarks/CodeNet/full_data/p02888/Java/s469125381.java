import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];		
		for(int i = 0;i<N;i++) {
			 a[i] = sc.nextInt();			
		}
		int count = 0;
		for(int j=0;j<N-2;j++) {
			for(int k = j+1;j<N-1;j++){
				for(int l = k+1;l<N;l++) {
					int sum = 0;
					if(a[j]<a[k]+a[l]&&a[k]<a[j]+a[l]&&a[l]<a[j]+a[k]) {
							count++;
					}
				}
			}
		}
		if(count-3<=0) {
			System.out.println(0);
		}
		System.out.println(count-3);
}
}