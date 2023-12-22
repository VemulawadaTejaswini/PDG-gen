import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ope = sc.nextInt(), outTime = sc.nextInt(), outCount = 0;
		
		for(int i = 0; i < ope; i++){
			int num = sc.nextInt(), times = sc.nextInt();
			
			for(int j = 0; j < times; j++){
				outCount++;
				if(outTime == outCount){
					System.out.println(num);
					System.exit(1);
				}
			}
		}
		
	}
 
}