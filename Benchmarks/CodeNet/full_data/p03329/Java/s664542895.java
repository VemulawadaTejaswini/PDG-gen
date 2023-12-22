import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int six[] = new int[6];
		int nine[] = new int[5];
		if (N<6) {
			System.out.println(N);
			return;
		} else if(N<9) {
			System.out.println(N-6+1);
			return;
		}
		six[0] =6;
		nine[0] =9;
		for (int i=1;i<6;i++) {
			six[i] = six[i-1]*6;
		}
		for (int i=1;i<5;i++) {
			nine[i] = nine[i-1]*9;
		}
		Main main= new Main();
		Queue<Money> queue = new ArrayDeque<Money>();
		int count = Integer.MAX_VALUE;
		Money money = main.new Money();
		money.money = N;
		money.count =0;
		queue.add(money);
		while (!queue.isEmpty()) {
			money = queue.poll();
			int sixMax =0;
			for (;sixMax<6;sixMax++) {
				if (six[sixMax]>money.money) {
					break;
				}
			}
			int nowCount = money.count+1;
			int nowMoney = money.money-six[sixMax-1];
			if (nowCount<count) {
				if (nowMoney<6) {
					nowCount +=nowMoney;
					if (nowCount<count) {
						count = nowCount;
					}
				} else if(nowMoney<9) {
					nowCount +=nowMoney-6+1;
					if (nowCount<count) {
						count = nowCount;
					}
				} else {
					Money temp = main.new Money();
					temp.count = nowCount;
					temp.money = nowMoney;
					queue.add(temp);
				}
			}
			int nineMax =0;
			for (;nineMax<5;nineMax++) {
				if (nine[nineMax]>money.money) {
					break;
				}
			}
			nowCount = money.count+1;
			nowMoney = money.money-nine[nineMax-1];
			if (nowCount<count) {
				if (nowMoney<6) {
					nowCount +=nowMoney;
					if (nowCount<count) {
						count = nowCount;
					}
				} else if(nowMoney<9) {
					nowCount +=nowMoney-6+1;
					if (nowCount<count) {
						count = nowCount;
					}
				} else {
					Money temp = main.new Money();
					temp.count = nowCount;
					temp.money = nowMoney;
					queue.add(temp);
				}
			}
		}
		System.out.println(count);
	}

	public class Money {
		int money;
		int count;
	}
}