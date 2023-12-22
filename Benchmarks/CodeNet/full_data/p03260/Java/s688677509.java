
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] list = br.readLine().split(" ");
			int A = Integer.parseInt(list[0]);
			int B = Integer.parseInt(list[1]);
			for(int C=1;C<=3;C++){
				int mul = A * B *C ;
				if((mul&1)==1){
					System.out.println("Yes");
					return;
				}
			}
			System.out.println("No");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}