import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();
	public static int max_repeat = 100;

	public static void main(String[] args) {

		String s = in.next();
		char[] t = in.next().toCharArray();

		int last=0;
		int repeat=0;
		int pow = 0;
		for(int i=0;i<t.length;i++) {
			int idx = s.indexOf(t[i]);
			if (idx==-1) {
				System.out.println(-1);
				return;
			}
			if(last >= idx) {
				repeat+=1;
				if(repeat==10) {
					repeat = 0;
					pow+=1;
					if(pow > 99){
						System.out.println(-1);
						return;
					}
				}
			}
			last = idx;
		}
		System.out.println(s.length()*(repeat+pow*10)+last+1);

	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
	}

}