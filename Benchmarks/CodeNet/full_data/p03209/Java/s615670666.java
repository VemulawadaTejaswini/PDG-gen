
import java.util.Scanner;
/**方針
//層の数が、Stringの桁数を溢れるかいなかの判断が必要。
//レベルN+1のバーガーには、レベルNのバーガーが2つ含まれるので、
//ざっくりレベルNのバーガーは、2^Nの文字数になる。（レベル０のバーガーが１文字なので）
//N<50なので、文字数の最大は2^50≒10^15。
//Stringは大体1億文字（10^8程度）までしか使えないので、単純にバーガーを文字で作ることはできない。
//
//そこで、バーガーの対称性や、再帰性に注目して、以下の作業を繰り返す。
//（ア）XがレベルNバーガーの中心層より、下のとき、
//レベルNバーガーのX番目だが、これはレベルN-1バーガーのX-1番目である。
//（イ）XがレベルNバーガーの中心層より、上のとき、
//レベルNバーガーのX番目は、レベルN-1バーガーの"X-(レベルN-1バーガーの層数)"層目である。
//ただし、このときはレベルN-1バーガーに含まれるパテ数＋１枚のパテを食べていることに注意（足していく）。
//この作業を繰り返していき、「1層目までを食べる。」等の計算できる状態となったときに計算して終了する。それまでに食べたパテ数が答え。
//ただし繰り返しの中で、もしも途中でXがレベルNバーガーの中心層になったら、簡単に計算できるので求めて、終わり。
*/

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long X = sc.nextLong();
		long ans = 0;
		sc.close();
		
		//レベルNバーガーの中心の層の数が格納された配列。
		long mid[] = new long[N+1];
		mid[0]=1;
		for(int i=1;i<=N;i++) {
			mid[i]=(mid[i-1]*2-1)+2;
		}
		//レベルNのパテ数が格納された配列。
		long puttyNum[]= new long[N+1];
		puttyNum[0]=1;
		for(int i=0;i<=N;i++) {
			puttyNum[i] = 2*puttyNum[i-1]+1;
		}
		
		int levelcount=N;//バーガーのレベル数(ループの度に小さくなる。)
		while (true) {
			//Xがバーガーの中心に当たる場合
			//1つ低いレベルのバーガーのパテ数＋１枚食べて終わり
			if(X==mid[levelcount]) {
				ans += puttyNum[levelcount-1]+1;
				break;
			}
			//Xがバーガーの中心より上にある場合
			else if(X>mid[levelcount]) {
				//Xがバーガーの一番上だった場合は、そのバーガーを食べきって終了
				if(X==mid[levelcount]*2-1) {
					ans += puttyNum[levelcount];
					break;
				}else {
				ans += puttyNum[levelcount-1]+1;
				X -= mid[levelcount];
				}
			}
			//Xがバーガーの中心より下にある場合
			else{
				//Xがバーガーの一番下だった場合は、終了
				if(X==1) {
					break;
				}else {
				X --;
				}
			}
			levelcount--;
		}		
		System.out.println(ans);
	}
}
