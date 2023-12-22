
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int a = sc.nextInt();
		int x =0;
		
		for(int i = 1;i<=a;i++){
			x = x+1;
			if(i==a){
				x=x+1;
				System.out.println(x);
				break;
			}
		}
	}
}
