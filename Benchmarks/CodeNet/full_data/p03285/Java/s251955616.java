import java.util.Scanner;

public class Main {

	static void show(boolean b){
		if(b) System.out.println("Yes");
		else System.out.println("No");
	}

	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        boolean result = false;

        //Number of total amounts
        int n = sc.nextInt();

        if(n % 4 == 0 || n % 7 == 0){
        	result = true;
        }
        else{
        	int x = 1;
        	while(4*x < n){
        		if((n - 4*x) % 7 == 0){
        			result = true;
        			break;
        		}
        		x++;
        	}
        }

        show(result);
	}
}