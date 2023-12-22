import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

	Scanner std = new Scanner(System.in);


	//List<Integer> list = new ArrayList<>();
	//int N = std.nextInt();

	//String S = std.next();
	long A = std.nextLong();
	long B = std.nextLong();
	int C = std.nextInt();
	int D = std.nextInt();

	long BBB = Takuma(B,C,D);
	long AAA = Takuma(A-1,C,D);

	long CCC = BBB-AAA;

	System.out.println(CCC);

	}


	public static long Takuma (long B,int C,int D) {

	int g;
	long bigC = B/C;
	long bigD = B/D;
	int CD = C*D;
	int copyC = C;

	//ユークリッドの互除法
	while((g = D%copyC) != 0) {
		D = copyC;
		copyC = g;
	}
	int l = CD/copyC;

	long bigL = B/l;



	long X = B - bigC - bigD +bigL; //B以下でCで割り切れるものとDで割り切れるものの数(重複は無視)

	//B以下でCで割れるものとDで割れるもの

	return X;

	}




	}


