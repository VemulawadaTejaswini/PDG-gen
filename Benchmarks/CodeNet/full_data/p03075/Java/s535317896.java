import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];
		
		boolean ch = true;


		for(int i=0;i<5;i++) {
			a[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();

		out: for(int i=0; i<4;i++) {
			for(int j=i+1;j<5;j++) {
				if(a[j]-a[i]<=k ) ch=true;
				else {
					ch=false;
					break out;
				}
			}
		}
		if(ch==true)System.out.print("Yay!");
		else System.out.print(":(");
	}
}
