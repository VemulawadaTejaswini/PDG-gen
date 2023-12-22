import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int a[] = new int[N];
	int f = 0;
	int maxM = 2;
	int aAll = 0;
	for(int i = 0;i < N; i++){
		a[i] = sc.nextInt();
		maxM = maxM + a[i];
	}
	for(int i = maxM;i > 1; i--){
		for(int ii = 0; ii < a.length;ii++){
			aAll = maxM % a[ii];
		}
		f = Math.max(aAll,maxM);
	}
	System.out.println(f);	
	}
}
	

