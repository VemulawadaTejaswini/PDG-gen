import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

	Scanner std = new Scanner(System.in);


	//List<Integer> list = new ArrayList<>();
	int N = std.nextInt();
	int K = std.nextInt();

	int a = 0;
	//int b = 0;
	//int c = 0;

	//N個のボールをK人に配る N-K,組み合わせ / で1>

	if(K == 1) {
		System.out.println(0);
	}


	if(N/K == 1 && N%K == 0)
		{  System.out.println(0);

	}


	if(N/K == 1) {
		a = N/K + N%K;
		System.out.println(a - 1);
	}




	//}






	}
}
