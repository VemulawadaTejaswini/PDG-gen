import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
	public static void main(String[] arg){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		int flag = 0;
		try {
			num = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i = 1; i <= 3; i++){
			if(num % 10 == 7){
				flag = 1;
				break;
			} else {
				num = num / 10;
			}
		}
		if(flag == 1){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		}
}