import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int aa=sc.nextInt();
		int yakusu=0;
		int tmp=0;
		for(int i=1; i<=aa; i+=2) {
			tmp=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					tmp++;
				}
			}
			if(tmp==8) {
				yakusu++;
			}
		}
		System.out.println(yakusu);
	}
}