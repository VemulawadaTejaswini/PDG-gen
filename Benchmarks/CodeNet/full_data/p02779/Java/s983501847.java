import java.util.Scanner;

public class Main {
  	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[] a = new long[N];
		//long a1 = sc.nextLong();

		boolean ans = true;

		for(int i=0;i<N;i++){
			a[i] = sc.nextLong();
		}

		for(int i=0;(i<N)&&(ans);i++){
			for(int j=i+1;j<N;j++){

				if(a[i] == a[j]){
					ans = false;
					break;
				}
			}
		}

		if(ans){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}