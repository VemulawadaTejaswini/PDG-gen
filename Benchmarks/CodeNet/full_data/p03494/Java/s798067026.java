import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A[] = new int[N];
		int count[] = new int[N];
		for (int i = 0 ; i < N ; i ++) {A[i] = scan.nextInt();}
		for (int j = 0 ; j < N ; j ++) {count[j] = 0;}
		for (int k = 0 ; k < N ; k ++) {
			while (A[k] % 2 == 0){A[k] /= 2 ; count[k]=count[k]+1;};}
		for (int l = 0 ; l < N-1 ; l ++) {
			if (count[l] < count[l+1]) {count[l+1] = count[l];};}
		System.out.println(count[N-1]);
	}
}