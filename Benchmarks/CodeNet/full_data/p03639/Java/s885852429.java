import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int[] a = new int[n];
			int o = 0;
			int f = 0;
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {
				if(a[i]%2!=0) {
					o++;
				}
				if(a[i]%4==0) {
					f++;
				}
			}
			
			if(o+f==n&&f!=0) {
				System.out.println("Yes");
			}else if(o==f){
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
		}

	}
