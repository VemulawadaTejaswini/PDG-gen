import java.util.Scanner;

public class Main{
	
	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		String aCards = scan.next();
		String bCards = scan.next();
		String cCards = scan.next();
		final int END = 0;
		final int A = 1;
		final int B = 2;
		final int C = 3;
		int turn = A;
		String winner = "";
		
		while(turn != END){
			switch(turn){
				case A:
					if(aCards.length() == 1){
						turn = END;
						winner = "A";
						break;
					}
					aCards = aCards.substring(1);
					if(aCards.charAt(0) == 'a'){
						turn = A;
					}
					if(aCards.charAt(0) == 'b'){
						turn = B;
					}
					if(aCards.charAt(0) == 'c'){
						turn = C;
					}
					break;
				case B:
					if(bCards.length() == 1){
						turn = END;
						winner = "B";
						break;
					}
					bCards = bCards.substring(1);
					if(bCards.charAt(0) == 'a'){
						turn = A;
					}
					if(bCards.charAt(0) == 'b'){
						turn = B;
					}
					if(bCards.charAt(0) == 'c'){
						turn = C;
					}
					break;
				case C:
					if(cCards.length() == 1){
						turn = END;
						winner = "C";
						break;
					}
					cCards = cCards.substring(1);
					if(cCards.charAt(0) == 'a'){
						turn = A;
					}
					if(cCards.charAt(0) == 'b'){
						turn = B;
					}
					if(cCards.charAt(0) == 'c'){
						turn = C;
					}
					break;				
			}
			
		}
		
		System.out.println(winner);
		
	}
}