
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int answer = 0;

		if(a<b){
			if(a+w<b){
				answer = b - a - w;
			}
		}else if(b<a){
			if(b+w<a){
				answer = a - b - w;
			}
		}
		System.out.println(answer);
	}
}
