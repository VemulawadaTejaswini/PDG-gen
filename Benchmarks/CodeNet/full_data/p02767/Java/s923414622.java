import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//public class atcoder0221_C{
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		List<Integer> X = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			X.add(scan.nextInt());
		}
//		int P = 0;

		int i = 0;
		int sum = 0;
		for(int tmp:X) {
			sum = sum+tmp;
			i++;
		}

		int av = sum/i;

		if(sum%i>0) {
			av++;
		}
		int result = 0;

		if(i>1) {
		for(int tmp2:X) {
			result=result+(tmp2-av)*(tmp2-av);
		}
		}else {
			result=av;
		}
		System.out.println(result);
	}
}

