import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int a = seer.nextInt();
		int b = seer.nextInt();
		if(a <= 5){
			System.out.println(0);
		}
		else if(a <= 12){
			System.out.println(b/2);
		}
		else{
			System.out.println(b);
		}
	}

}
