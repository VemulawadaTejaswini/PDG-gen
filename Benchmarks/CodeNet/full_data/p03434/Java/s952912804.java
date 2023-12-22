import java.util.*;
public class Main{
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int totalCard = scanner.nextInt();
		int [] cardList = new int[totalCard];
		
		for (int index=0; index<totalCard; index++) {
			int temp = scanner.nextInt();
			cardList[index]=temp;
		}
		
		int alicePoint = 0;
		int bobPoint = 0;
		
		boolean aliceTurn = true;
		for (int index=0; index<totalCard; index++) {
			
			int card = getMaximum(cardList);
			if (aliceTurn==true) {
				alicePoint+=card;
				aliceTurn = false;
			} else {
				bobPoint+=card;
				aliceTurn = true;
			}
		}
		
		System.out.println(Math.abs(alicePoint-bobPoint));
		
	}
	
	static int getMaximum (int[] cardList) {
		
		int maximum = 0;
		int maximumIndex = 0;
		
		for (int index=0; index<cardList.length; index++) {
			int temp = cardList[index];
			if (temp>maximum) {
				maximum=temp;
				maximumIndex=index;
			}
		}
		cardList[maximumIndex]=0;
		return maximum;
	}
}