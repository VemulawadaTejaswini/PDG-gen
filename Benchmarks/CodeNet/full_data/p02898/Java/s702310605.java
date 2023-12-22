import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int numFriend = sc.nextInt();
		int maxHeight = sc.nextInt();

		int canGo = 0;
		for(int i=0; i<numFriend; i++){
			int height = sc.nextInt();
			if(height >= maxHeight)
				canGo+=1;
		}
		System.out.println(canGo);

	}
}