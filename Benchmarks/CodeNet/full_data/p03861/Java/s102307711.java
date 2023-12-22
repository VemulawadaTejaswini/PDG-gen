import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		
		Long a = x.nextLong();
		Long b = x.nextLong();
		Long y = x.nextLong();
		
		int count = 0;
		
		for(Long i = a; i <= b; i++) {
			if(i % y == 0) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
