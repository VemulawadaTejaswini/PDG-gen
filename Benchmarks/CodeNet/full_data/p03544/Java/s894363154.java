import java.util.*;
public class Main{
	static long Lucas(int k){
		long Li = 2;
		long Lj = 1;
		long Lk = 0;
		if(k==1)return 2;
		if(k==2)return 1;
		for(int i=0; i<k-1; i++){
			Lk = Lj + Li;
			Li = Lj;
			Lj = Lk;
		}
		return Lk;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Lucas(n));
	}
}