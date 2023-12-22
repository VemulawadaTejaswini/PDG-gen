import java.util.Arrays;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		int n = sc.nextInt();
		int[] a = new int[n];
		
		
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();			
		}
		Arrays.sort(a);
		
		
		boolean odd = false;
		for(int i = 1;i < n;i++){
			if(a[i] % a[0] != 0){
				odd = true;
			}
		}
		if(odd){
			System.out.println(1);
		}else{
			if(a[0] == a[n-1]){
				System.out.println(a[0]);

			}else{
				System.out.println(1);

			}
		}
		
	}
}

