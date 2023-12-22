import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();

		int count =0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				for(int l=1;l<=n;l++){
					if(k%2==0){
						if((i+j+l)*2%k!=0){
						continue;
						}
					}else{
						if((i+j+l)%k!=0){
						continue;
						}
					}

					if(calcK(i,j,l,k)){
					// System.out.println("calc "+i+" "+j+" "+l);
					count++;
					}

				}
			}
		}
		//3つがkの倍数である
		//a+b = kl
		// b+c = km
		// c+a = k f
		// a+b+c = k/2の倍数
		// kが偶数ならa+b+cはk/2ごとに考える
		// kが奇数ならa+b+cはkごとに考える

		// 偶数の場合はもうちょいシンプルかも
		// k/2の組とk/2 * p を列挙する

			System.out.println(count);
	}

	public static boolean calcK(int a ,int b,int c,int k) {
		// System.out.println("calc "+a+" "+b+" "+c);
		if((a+b)%k==0){
			// System.out.println("a+b is ok");
		}else{
			return false;
		}

		if((b+c)%k==0){
			// System.out.println("b+c is ok");
		}else{
			return false;
		}

		if((a+c)%k==0){
			// System.out.println("a+c is ok");
		}else{
			return false;
		}

		return true;
	}


}


