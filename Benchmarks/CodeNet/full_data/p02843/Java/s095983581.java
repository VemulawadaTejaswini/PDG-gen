import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solove();
	}
	
	public void solove() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		
		int simo2 = x % 100;
		
		int minimumNum = 0;
		int minimumPrice = 0;
		
		while(simo2 >= 5) {
			simo2 -= 5;
			minimumNum++;
			minimumPrice += 105;
		}
		while(simo2 >= 4) {
			simo2 -= 4;
			minimumNum++;
			minimumPrice += 104;
		}

		while(simo2 >= 3) {
			simo2 -= 3;
			minimumNum++;
			minimumPrice += 103;
		}
		

		while(simo2 >= 2) {
			simo2 -= 2;
			minimumNum++;
			minimumPrice += 102;
		}
		

		while(simo2 >= 1) {
			simo2 -= 1;
			minimumNum++;
			minimumPrice += 101;
		}
		
		if(minimumPrice > x) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}
	}
}
