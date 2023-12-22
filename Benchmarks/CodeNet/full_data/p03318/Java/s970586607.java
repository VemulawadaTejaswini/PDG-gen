import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int k = sc.nextInt();
		int ketasu=1;
		int sss=1;
		for(long i=0; i<k; i++) {
			String n="";
			n+=sss;
			if(ketasu>1) {
			for(int j=0; j<ketasu-1; j++) {
				n+="9";
			}
			}
			System.out.println(n);
			sss++;
			if(sss>9) {sss=1;ketasu++;}
		}
	}
}