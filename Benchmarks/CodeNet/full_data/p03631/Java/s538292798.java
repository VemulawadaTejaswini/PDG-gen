import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int num = scan.nextInt();
			
			int b = num/100;
			int s = num/10%10;
			int g = num%10;
			
			if(b==g){
				System.out.println("Yes");
			}
			else{
				System.out.println("NO");
			}
			
		}
	}

}