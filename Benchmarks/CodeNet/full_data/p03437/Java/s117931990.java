import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//入力
		long X = scanner.nextInt();
		long Y = scanner.nextInt();
		long answer = -1;

		if( Y % X != 0){
			long temp = X;
                        long  i = 1;
			long r = 1000000000000000000L;
			while(temp <= r){
				if(temp % Y != 0){
					answer = temp;
					break;
				}
				temp = X * i;
				i++;
			}
		}

		System.out.println(answer);
		scanner.close();
	}
}