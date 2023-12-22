import java.util.Scanner;

class Main{




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] a = new int[n];


		for(int i =0;i < n;i++){
			a[i] = sc.nextInt();
		}
		
		
		int f = 0;


		for(int i =0;i < n;i++){
			if(a[i] % 4 == 0){
				f++;		
			}
		}

		int t = 0;
		for(int i = 0;i < n;i++){
			if(a[i] % 2 == 0){
				t ++;
			}
		}

		if(f >= (n-t)/2 ){
			System.out.println("Yes");
		}else{
			System.out.println("No");

		}
	}
}


