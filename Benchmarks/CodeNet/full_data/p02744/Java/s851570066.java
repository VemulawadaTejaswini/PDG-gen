import java.util.Scanner;

public class Main {
	static char[] letter= new char[]{'a','b','c','d','e','f','g','h','i','j'};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		byte a[] = new byte [N];
		for (int i =0;i<N;i++) {
			a[i]='a';
		}
		String s = new String(a);
		Main main = new Main();
		main.printResult(a,0,a.length,1) ;
	}
	public void printResult(byte[] s,int vocation,int length,int count) {
		if (length-1 == vocation) {
			System.out.println(new String(s));
			return ;
		} else {
			System.out.println(new String(s));
			for (int i =length-vocation-1;i>0;i--) {
				String str = new String(s);
				byte s1[]=str.getBytes();
				s1[i+vocation]=(byte)letter[count];
				printResult(s1,vocation+i,length,count+1) ;
			}

		}

	}
}