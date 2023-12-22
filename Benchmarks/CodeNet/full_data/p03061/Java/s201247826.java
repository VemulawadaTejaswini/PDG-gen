import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int number = sc.nextInt();
		Calc calc = new Calc();
		for(int i=0;i<number;i++) {
			int x = sc.nextInt();
			double xsqrt = Math.sqrt(x);
			calc.add(x);
			for(int j=2;j<=xsqrt;j++) {
				if(x%j==0) {
					calc.add(j);
					calc.add(x/j);
				}
			}
		}
		sc.close();

		System.out.println(calc.max(number));
	}
}



class Calc{
	ArrayList<int[]> count = new ArrayList<int[]>(10000);
	int add(int num) {
		for(int[] numinfo:count)
			if(numinfo[0]==num) {
				numinfo[1]++;
				return 1;
			}
		int[] numinfo = {num,1};
		count.add(numinfo);
		return 0;
	}
	
	int max(int number) {
		int max = 1;
		for(int[] numinfo:count) {
			if(numinfo[1] >= number-1 && numinfo[0] > max)
				max = numinfo[0];
		}
		return max;
	}
}