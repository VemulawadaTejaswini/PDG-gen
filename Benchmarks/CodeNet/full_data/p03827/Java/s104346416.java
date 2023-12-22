import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String S = sc.next();
		int x = 0;
		int answer = 0;
		for(int i = 0;i < N;i++){
			char word = S.charAt(i);
			if(word == 'I'){
				x--;
			}
			else if(word == 'D'){
				x++;
				if(answer <= x){
					answer = x;
				}
			}
		}
		System.out.println(answer);	
	}
}