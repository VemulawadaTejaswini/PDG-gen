import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long K = scan.nextLong();
		int T = scan.nextInt();
		int a[] = new int[T];
		int max = 0;
		for(int i=0;i<T;i++){
			a[i] = scan.nextInt();
			max = Math.max(a[i], max);
		}

		if(T==1){
			System.out.println(a[0]-1);
			return;
		}


		int count = 0;
		for(int i=0;i<T;i++){
			if(a[i]==max){
				count++;
			}
		}
		if(count>1){
			System.out.println(0);
		}else{
			System.out.println((max-2)/2);
		}


	}

}