

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String a = input.readLine( );
		String b = input.readLine( );
		int a1;
		int b1;

		while(a.length()>0 && b.length()>0){
			a1 = Integer.parseInt(a.substring(0, 1));
			b1 = Integer.parseInt(b.substring(0, 1));
			if(a1>b1){
				System.out.println("GREATER");
				break;
			}else if(b1>a1){
				System.out.println("LESS");
				break;
			}
		}

	}

}
