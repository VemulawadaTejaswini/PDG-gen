import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int numOfCards = s.nextInt();
		int numOverlap = 0;
		Set<Integer> cards = new HashSet<Integer>();
		for(int i = 0; i< numOfCards; i++){
			int tmp = s.nextInt();
			if(!cards.contains(tmp)){
				cards.add(tmp);
			}else{
				numOverlap++;
			}
		}
		if(numOverlap % 2 == 0){
			System.out.println(numOfCards - numOverlap);
		}else{
			System.out.println(numOfCards - numOverlap-1);
		}
	}

}
