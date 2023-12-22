import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] moji = S.toCharArray();
		for(int i = 0; i < moji.length; i ++){
			System.out.print((char)(mojiAdd(moji[i], N)));
		}
		System.out.println();
	}

	public static int mojiAdd(char moji, int N){
		if((int)(moji) + N > 90){
			return (int)(moji) + N - 26;
		}else{
			return (int)(moji) + N;
		}
	}
}
