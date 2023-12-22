import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();

		for(int i=0;i<n;i++) {
			array.add(sc.nextInt());
		}
		int min=100000;
		int t=0;
		int sum1=0;
		int sum2=0;
		int i,j;
		while(true) {
			for(i=0;i<t;i++) {
				sum1+=array.get(i);
			}
			for(j=array.size()-1;j>=i;j--) {
				sum2+=array.get(j);
			}
			if(min>=Math.abs(sum1-sum2)) min=Math.abs(sum1-sum2);
			t++;

			sum1=0;
			sum2=0;
			if(t==n)break;
		}
		System.out.println(min);
	}
}

