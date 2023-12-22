import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int ex = Integer.parseInt(sc.next());
		int[] teki = new int[n];
		for(int i = 0; i < n; i++){
			teki[i] = Integer.parseInt(sc.next());
		}
		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j++){
				if(teki[i] > teki[j]){
					int tmp = teki[i];
					teki[i] = teki[j];
					teki[j] = tmp;
				}
			}
		}
		n -= ex;
		long res = 0L;
		for(int i = 0; i < n; i++){
			res += teki[i];
		}
		System.out.println(res);
	}
}