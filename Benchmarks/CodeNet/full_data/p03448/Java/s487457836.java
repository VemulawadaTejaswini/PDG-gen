import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = scan.nextInt();

		int count =0;

		for(int i=0;i<=a;i++) {
			for(int l=0;l<=b;l++) {
				for(int m=0;m<=c;m++) {
					if(x==500*i+100*l+50*m) {
						count++;
					}
				}
			}
		}
		/*
		//xを50円玉で構成した場合
		int only50 = x/50;

		//50円玉のみで作った場合
		if(only50<=c) {
			count++;
		}

		//100円も混ぜる場合
		int use100=only50/2;
		if(use100>=b) {

			count= count + b+(x-use100)/c;
		}else {
			count = count + use100;
		}

		int use500=only50/10;
		if(use500>=a) {
			count= count + a;
		}else {
			count = count + use500;
		}
		*/

		System.out.println(count);
	}

}
