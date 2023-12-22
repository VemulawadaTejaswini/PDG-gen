import java.util.Arrays;
import java.util.Scanner;
class Main{
	static int yn=0;//YES,NO→0,Yes,No→1,yes,no→2
	static Scanner scan=new Scanner(System.in);
	public static void main(String[]args) {
		/*通常出力→pl(String),
		 Yes,No出力→plyn(Yes→1,No→0)
		 入力→sc();void
		 */
		int a=sc();
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=sc();
		}
		int c=sc();
		if(c>a) {
			plyn(0);
			return;
		}
		int d[]=new int[c];
		for(int i=0;i<c;i++) {
			d[i]=sc();
		}
		Arrays.sort(b);
		Arrays.sort(d);
		int len=b.length;
		int count=0;
		for(int i=0;i<len;i++) {
			if(count==c) {
				break;
			}
			if(d[count]==b[i]) {
				count++;
			}
		}
		if(count==c) {
			plyn(1);
		}
		else {
			plyn(0);
		}
	}
	
	public static int sc() {
		int sc=scan.nextInt();
		return sc;
	}
	public static void pl(String str) {
		System.out.println(str);
	}
	public static void plyn(int a) {
		if(yn==0) {
			if(a==1) {
		System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		else if(yn==1){
			if(a==1) {
				System.out.println("Yes");
				}
			else {
				System.out.println("No");
			}
		}
		else if(yn==2){
			if(a==1) {
				System.out.println("yes");
				}
			else {
				System.out.println("no");
			}
		}
	}
}