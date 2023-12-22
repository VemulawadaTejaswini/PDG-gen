import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int tmp=0;

		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
			for(int j=0; j<(i+1)/2; j++){
				tmp = a[j];
				a[j] = a[i-j];
				a[i-j] = tmp;
			}
		}
		String ans = "";
		for(int i=0; i<N; i++){
			ans += a[i]+" ";
		}
		System.out.println(ans);
    }
}
