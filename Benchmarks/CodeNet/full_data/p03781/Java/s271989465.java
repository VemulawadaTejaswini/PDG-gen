import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int result = 0;
		for(int i = 1; i <= X; i++){
			if((i + 1) * i / 2 >= X){
				result = i;
				break;
			}
		}
		System.out.println(result);
		sc.close();
	}
}