import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), L = sc.nextInt();
		String[] array = new String[N];
		int[] min= new int[N];
		for(int i=0;i<N;i++) {
			array[i] = sc.next();
			for(int j=0;j<L;j++) {
				min[i] += array[i].charAt(j);
			}
		}

		int[] buff = min.clone();
		Arrays.sort(buff);
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(buff[i]==min[j]) {
					System.out.print(array[j]);
				}
			}
		}
		/*if(N!=0) {
			System.out.println("Yes");//Yes or YES注意！！
		}else {
			System.out.println("No");//No or NO注意！！
		}*/

	}
	public static int sample(int n) {
		return n;
	}

}
