import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int rem = N % 10;
        int div = N / 10;
        if(rem == 0){
        	while(div >= 100){
            	div /= 10;
        	}
    		System.out.println(div);
        }else{
        	while(div >= 10){
            	rem += div % 10;
            	div /= 10;
        	}
    		System.out.println(div + rem);
		}
    }
}