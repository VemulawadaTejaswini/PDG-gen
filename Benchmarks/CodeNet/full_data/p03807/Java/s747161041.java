
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		int n = Integer.parseInt(str);
		str = input.readLine( );
		String[] list = str.split(" ");
		long count = 0;
		for(int i=0; i<n; i++){
			count += Integer.parseInt(list[i])%2;
		}
		if(count%2 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}
}
