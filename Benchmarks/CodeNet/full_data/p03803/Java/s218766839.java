import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		String[] box = buff.readLine().split(" ");
		int A = Integer.parseInt(box[0]);
		int B = Integer.parseInt(box[1]);

		if(A == B){
			System.out.println("Draw");
			return;
		}

		boolean flag = false;
		if(A < B){
			if(A == 1){
				flag = true;
			}else{
				flag = false;
			}
		}else if(A > B){
			if(B == 1){
				flag = false;
			}else{
				flag = true;
			}
		}

		if(flag){
			System.out.println("Alice");
		}else{
			System.out.println("Bob");
		}

	}

}
