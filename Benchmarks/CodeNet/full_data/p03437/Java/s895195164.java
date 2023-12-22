import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//入力
		long X = scanner.nextLong();
		long Y = scanner.nextLong();
		long answer = -1;

		if(X < Y){
			answer = X;
		}else if( Y % X != 0){
			long temp;
				temp = X; 
            long  i = temp / X;
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