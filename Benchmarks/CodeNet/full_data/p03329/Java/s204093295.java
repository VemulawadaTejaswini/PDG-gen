import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		ArrayList<Integer>drawableMoney = new ArrayList<Integer>();

		drawableMoney.add(1);
		for (int i=1; (Math.pow(6,i)) <= 100000; i++){
			drawableMoney.add((int) Math.pow(6,i));
		}
		for (int i=1; (Math.pow(9,i)) <= 100000; i++){
			drawableMoney.add((int) Math.pow(9,i));
		}
		Collections.sort(drawableMoney);

		int temp = N;
		int drawCount = 0;
		int drawMoney;

		while (temp > 0){

			for (int i = drawableMoney.size() -1; i >=0; i--){
				if (temp == 12 || temp == 13 || temp == 14){
					temp = temp - 6;
					drawCount++;
				} else {
					drawMoney = drawableMoney.get(i);
					if (temp >= drawMoney){
						temp = temp - drawMoney;
						drawCount++;
						break;
					}
				}
			}
		}
		System.out.println(drawCount);
	}
}
