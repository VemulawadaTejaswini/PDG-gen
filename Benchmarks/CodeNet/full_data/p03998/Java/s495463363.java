import java.util.Scanner;

public class Main{
	public static char abc_ans(String str_a, String str_b, String str_c){
		char[] a = str_a.toCharArray();
		char[] b = str_b.toCharArray();
		char[] c = str_c.toCharArray();

		int a_count = a.length;
		int b_count = b.length;
		int c_count = c.length;

		int a_number = 0;
		int b_number = 0;
		int c_number = 0;

		char x = a[a_number];
		while(true){
			switch (x){
				case 'a':
					a_number ++;
					if(a_number >= a.length){
						return('A');
					}
					x = a[a_number];
					break;
				case 'b':
					b_number ++;
					if(b_number >= b.length){
						return('B');
					}
					x = b[b_number];
					break;
				case 'c':
					c_number ++;
					if(c_number >= c.length){
						return('C');
					}
					x = c[c_number];
					break;
			}
		}
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String str_a = scan.next();
		String str_b = scan.next();
		String str_c = scan.next();

		System.out.println(abc_ans(str_a,str_b,str_c));
	}
}
