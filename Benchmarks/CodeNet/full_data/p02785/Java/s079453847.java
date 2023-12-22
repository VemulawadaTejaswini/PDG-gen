import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int monsters = sc.nextInt();
		int wazaCount = sc.nextInt();
		int [] monstersHp = new int[monsters];

		for(int i = 0; i < monstersHp.length; i ++) {
			monstersHp[i] = sc.nextInt();
		}

		int attack = 0;

		if(wazaCount >= monsters) {

			System.out.println(attack);

		}else if(wazaCount == 0){

			for(int i = 0; i < monstersHp.length; i ++) {
				attack += monstersHp[i];
			}

			System.out.println(attack);

		}else {

			//降順にソート
			int count = monstersHp.length-1;
			for(int i = 0; i < monstersHp.length; i++) {
				for(int j=0; j < count; j++) {
					if(monstersHp[j+1]>monstersHp[j]) {
						int tmp = monstersHp[j+1];
						monstersHp[j+1] = monstersHp[j];
						monstersHp[j] = tmp;
					}
				}
				count--;
			}

			int index = wazaCount;

			for(int i = index; i < monstersHp.length; i ++) {
				attack += monstersHp[i];
			}

			System.out.println(attack);

		}
	}
}