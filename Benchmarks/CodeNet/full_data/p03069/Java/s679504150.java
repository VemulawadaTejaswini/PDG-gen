import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner $ = new Scanner(System.in);
		int N = $.nextInt(), n = 0;
		String S = $.next();
		for (int i = 1; i < N; i++){
			String s = S.substring(i - 1, i + 1);
			if (s.equals("#.")) n++;
		}
		System.out.println(n);
		/*
		3 #.# -> 1
		5 #.##. -> 2
		9 ......... -> 0
		*/
	}
}
