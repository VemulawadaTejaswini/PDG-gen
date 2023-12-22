import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a= new int[3];
		for(int i=0;i<3;i++) {
			a[i]=scan.nextInt();
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<3;i++) {
			for(int j=i+1;j<3;j++) {
				max=Math.max(max, Math.abs(a[j]-a[i]));
			}
		}
		System.out.println(max);
	}

}
