import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int sum = 0;
		boolean zr=false;
		for(int i=1;i<=n;i++) {
			int azi=l+i-1;
			if(azi==0) {
				zr=true;
			}
			sum +=azi;
		}
		if(zr) {
			System.out.println(sum);
		}else if(l>=1) {
			System.out.println(sum-(l));
		}else {
			System.out.println(sum-(l+n-1));
		}
	}
}