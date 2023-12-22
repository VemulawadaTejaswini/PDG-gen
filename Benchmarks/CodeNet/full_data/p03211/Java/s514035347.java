import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		String s = sc.next();

		int l = s.length();

		int S = Integer.parseInt(s);  // Integer.parseInt(String s) stringをintで返す

		int[] a = new int[l-2];

		String[] figure = new String[l-2];

		for(int i=0; i<=l-3; i++) {
			figure[i] = s.substring(i,i+3);
			a[i] = Integer.parseInt(figure[i]);
			//substring(int a, int b)  !!aからb-1番目!!までの文字列を返す　0始まり
		}
		int min = 999;
		for(int i=0; i<=l-3; i++) {
			min =Math.min(min, Math.abs(753-a[i]));
		}

		System.out.println(min);
        
	}

}
