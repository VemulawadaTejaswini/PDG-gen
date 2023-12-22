import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] a = new int[5];
		int i;
		Scanner sc = new Scanner(System.in);
		for(i=0; i<5; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		sc.close();
		sc = null;
		boolean f = true;
		LABEL:for(i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(Math.abs(a[i]-a[j])>k) {
					f = false;
					break LABEL;
				}
			}
		}
		if(f) System.out.println("Yay!");
		else System.out.println(":(");
	}
}