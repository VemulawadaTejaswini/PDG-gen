import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> scores = new LinkedList<>();
		
		// input
		final int HEIGHT = scan.nextInt();
		final int WIDTH = scan.nextInt();
		char[][] canvas = new char[HEIGHT+2][WIDTH+2];
		for(int i = 1; i <= HEIGHT; i++){
			String input = scan.next();
			char[] temp = input.toCharArray();
			for(int j = 1; j <= WIDTH; j++){
				canvas[i][j] = temp[j-1];
			}
		}
		
		// search
		String answer = "Yes";
		loop: for(int i = 1; i <= HEIGHT; i++){
			for(int j = 1; j <= WIDTH; j++){
				if(canvas[i][j] == '#'){
					if(canvas[i-1][j] != '#' && canvas[i+1][j] != '#' && canvas[i][j-1] != '#' && canvas[i][j+1] != '#'){
						answer = "No";
						break loop;
					}
				}
			}
		}
		
		// answer
		System.out.println(answer);

	}
}