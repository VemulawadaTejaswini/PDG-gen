import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int returnInt = 0;
		float[] cards = new float[size];
		float sum = 0;
		for (int i = 0; i < cards.length; i++) {
			cards[i] = s.nextInt();
			sum += cards[i];
		}
		float min = sum;
		float tmpSum = cards[0];
		if (size == 2){
			returnInt = (int)Math.abs(cards[0]  - cards[1]);
		}else{
			for (int i = 1; i < cards.length; i++) {
				tmpSum += cards[i];
				if(Math.abs(tmpSum  - sum/2) < min){
					min = Math.abs(tmpSum  - sum/2);
				}
			}
			returnInt = (int) (min*2);
		}	
		System.out.println(returnInt);

	}
}
