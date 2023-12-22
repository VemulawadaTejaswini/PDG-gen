import java.util.Scanner;
public class Main {
	public static void main(String args[]){
	@SuppressWarnings("resource")
	int n= new Scanner(System.in).nextInt();
	if(n >9 && n<100){
		if(n>=90){
			System.out.println("OK");
		}else{
			if(n % 10 >= 9){
				System.out.println("OK");
		}else{
			if(n % 10 <= 8)
			System.out.println("NO");
			}
		}
	}
}}