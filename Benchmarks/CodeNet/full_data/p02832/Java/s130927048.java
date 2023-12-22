import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int[] a = new int[N]; 
			int check = 1;
			int destroy = 0;
			for(int i=1;i<=N;i++) {
				a[i-1] = sc.nextInt();
				if(a[i-1]==check) {
					check++;
				}else {
					destroy++;
				}
			}
			
			if(destroy==N) {
				System.out.println(-1);
			}else {
				System.out.println(destroy);
			}
			
	}	

}