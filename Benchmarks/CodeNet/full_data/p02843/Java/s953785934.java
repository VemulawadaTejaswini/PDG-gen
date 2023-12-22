import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int s = sc.nextInt();
		int a = s/100;
		int b = s-a*100;

		if(a>=1){
				if(b<=a*5){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
		}else{
			System.out.println(0);
		}
	}

}
