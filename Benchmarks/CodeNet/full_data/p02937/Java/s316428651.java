import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int loop = 0;
		int p = 0;
		int p_taihi=-1;
		int kari = -1;
		String str1 = scan.next();
		String str2 = scan.next();
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		scan.close();
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] == c2[p]) {
				p++;
			}
			if (p == c2.length) {
				kari = (loop * c1.length + i + 1);
				break;
			}
			if (i == c1.length - 1) {
				loop++;
				i = -1;
			}
			if(p<loop){
				kari=-1;
				break;
			}
 
		}
 
		System.out.print(kari);
	}
 
}