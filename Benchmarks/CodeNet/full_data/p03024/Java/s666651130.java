import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String winLoss = sc.nextLine();
		int wins =0;
		int loss=0;
		for(int i = 0; i<winLoss.length();i++){
			if (winLoss.charAt(i) == 'o'){
				wins++;
			}
			else if(winLoss.charAt(i)=='x'){
				loss++;
			}
			if(wins >= 8){
				System.out.println("YES");
				return;
			}
			if(loss>= 8){
				System.out.println("NO");
				return;
			}
			else if(i == winLoss.length()-1 && i != 15){
				if(15-loss >= 8)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
		return;
	}