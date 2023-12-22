import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long monster_h = sc.nextLong();
		int count = 1;

		while(monster_h /2 != 1 ) {
			if(monster_h % 2 == 0) {
				monster_h = monster_h / 2;
			} else {
				monster_h = (monster_h -1) / 2;
			}
			count++;
		}

		long sum = 1;
		int i;
		for(i=1; i <= count; i++) {
			sum = (long) (sum + Math.pow(2,i));
		}
		System.out.println(sum);
		sc.close();
	}

}
