import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		int ans = 0;

		int pp = 0;
		int qq = 0;

	for(int i = 1 ; i <= N ; i++){
		if(i%K == 0){
			pp++;
		}
		if(i%K == K/2){
			qq++;
		}
	}

	if(K%2!=0){
		System.out.println((long)Math.pow(pp, 3));
	}
	else{
		System.out.println((long)Math.pow(pp,3) + (long)Math.pow(qq, 3));
	}


	}
}

