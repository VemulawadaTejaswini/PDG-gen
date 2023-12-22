import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int w = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(w<w+a-b&&w>w+b-a){
					System.out.println(0);
				}else if(Math.abs(w+a-b)<Math.abs(w+b-a)){
					System.out.println(Math.abs(w+a-b));
				}else{
					System.out.println(Math.abs(w+b-a));
				}
				
		}	
	}