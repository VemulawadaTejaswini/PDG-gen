import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		int[] a;
		int[] b;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		b = new int[n];
			for(int i=0;i<n-1;i++) {
				sc.nextInt();
				sc.nextInt();
				a[i] = sc.nextInt();
				sc.nextLine();
			}
			for(int i=0;i<n-1;i++) {
				if(a[i]==0) {
					if(i==1) {
						b[i]=0;
					}
					b[i+1] = (b[i]==0)?0:1;
				}else {
					b[i+1] = (b[i]==0)?1:0;
				}
			}
			for(int i=0;i<n;i++) {
				
				System.out.println(b[i]);
			}
		}
	}
