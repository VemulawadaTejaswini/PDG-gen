import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] a = new int[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			int ret = 0;
			int num=1;
			for(int i=0;i<1000;i++) {
				ret++;
				if(i==0) {
					num =0;
				}else {
					num = a[num]-1;
				}
				
				if(a[num]==2) {
					System.out.println(ret);
					return;
				}
				
				
			}
			System.out.println("-1");
			
		}	
	}