import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y=0;
		for(int i=1;i<=x;i++){
			if(i%3==0&&i%5==0){
				y+=i;
			}
				
		}
			System.out.print(y);

		

	}
}