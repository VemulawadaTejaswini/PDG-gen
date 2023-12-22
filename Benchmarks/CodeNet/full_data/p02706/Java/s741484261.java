import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int hw=sc.nextInt();
		int[] homework=new int[hw];
		int s=0;
		for(int i=0;i<hw;i++) {
			homework[i+1]=sc.nextInt();
			s=s+homework[i+1];
		}
		if(d-s<0) {
			System.out.println(-1);
		}
		System.out.print(d-s);
	}

}
