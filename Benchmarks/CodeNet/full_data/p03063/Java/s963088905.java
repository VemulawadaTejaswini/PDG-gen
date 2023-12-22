
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		char[] stone = sc.next().toCharArray();
		
		int black = 0;
		int white = 0;
		int tmp_black = 0;
		boolean flag = false;
		for(char c : stone){
			if(c=='#'){
				flag=true;
				tmp_black++;
			}
			if(c=='.' && flag){
				white++;
				black += tmp_black;
				tmp_black = 0;
			}
		}
		int ans = Math.min(black, white);
		System.out.println(ans);
		
		sc.close();
	}
	
}
