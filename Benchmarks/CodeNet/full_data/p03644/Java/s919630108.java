import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	Scanner scanner=new Scanner(System.in);

    	int n =scanner.nextInt();

    	int pow=1;


    	while(true) {

    		if(n>=pow*2) {
    			pow*=2;
    		}else {
    			break;
    		}

    	}


    	System.out.println(pow);

    	scanner.close();


    }

}