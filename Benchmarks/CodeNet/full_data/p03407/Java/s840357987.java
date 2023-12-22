import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	int c=sc.nextInt();
    	
    	if(a+b>=c) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}

    }

}





