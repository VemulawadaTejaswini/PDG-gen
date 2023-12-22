import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int[] a=new int[10];
		for(int i=0;i<4;i++) {
			int buff=sc.nextInt();
			if(a[buff]!=0) {
				System.out.println("NO");
				System.exit(0);
			}
			a[buff]++;
		}
		if(a[1]+a[9]+a[7]+a[4]==4) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
/*各競技において，
3
 位の選手は
100000
 円，
2
 位の選手は
200000
 円，
1
 位の選手は
300000
 円の賞金を獲得します．また，コード部門と装置実装部門の両方で
1
 位となった選手は，さらに
400000
 円の賞金を獲得します．*/