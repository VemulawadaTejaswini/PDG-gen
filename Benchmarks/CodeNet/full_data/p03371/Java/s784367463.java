import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aPrice  = sc.nextInt();
		int bPrice  = sc.nextInt();
		int abPrice  = sc.nextInt();
		int aHituyoSu = sc.nextInt();
		int bHituyoSu = sc.nextInt();
		int normalPrice = (aPrice * aHituyoSu) + (bPrice * bHituyoSu);
		int small= 0;
		int big= 0;
		boolean aBigFlg = false;
		if(aHituyoSu < bHituyoSu) {
			big = bHituyoSu;
			small = aHituyoSu;
		}else {
			big = aHituyoSu;
			small = bHituyoSu;
			aBigFlg = true;
		}
		int answer = normalPrice;
		for(int i =1;i <=big;i++) {
			int price = 0;
			if(i <= small) {
				price = normalPrice -((aPrice +bPrice) * i) + (abPrice* 2 * i);
			}else {
				if(aBigFlg) {
					price = (abPrice* 2 * i) + aPrice * (aHituyoSu -i);
				}else {
					price = (abPrice* 2 * i) + bPrice * (bHituyoSu -i);
				}
			}
			if(answer >price) {
				answer = price;
			}

		}

		System.out.println(answer);

	}
}