import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数字を3つ入力してください");
	
		long a = Long.parseLong(br.readLine());
		long b = Long.parseLong(br.readLine());
		long x = Long.parseLong(br.readLine());
		
		
		if(a == x || b == x){
			System.out.println("1");
		}
		else if(a>b || b<x){
			System.out.println("0");
		}
		else if(a<b){
			System.out.println((b/x)-(a/x)+1);
			}
		else if(a==b){
			System.out.println("0");
		}
		
		else{
			System.out.println("0");
		}
		
		
		
	}
}
