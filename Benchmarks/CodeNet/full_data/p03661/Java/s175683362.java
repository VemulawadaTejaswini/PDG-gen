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
		float min = Float.MAX_VALUE;
		float tmpSum1 = cards[0];
		float tmpSum2 = cards[size-1];
		if (size == 2){
			returnInt = (int)Math.abs(cards[0]  - cards[1]);
		}else{
			for (int i = 1; i < cards.length-1; i++) {
				tmpSum1 += cards[i];
				tmpSum2 += cards[cards.length - 1 - i];
				if(Math.abs(tmpSum1  - sum/2) < min){
					min = Math.abs(tmpSum1  - sum/2);
				}
				if(Math.abs(tmpSum2  - sum/2) < min){
					min = Math.abs(tmpSum2  - sum/2);
				}
			}
			returnInt = (int) (min*2);
		}	
		
		
		
		System.out.println(returnInt);

	}
}

