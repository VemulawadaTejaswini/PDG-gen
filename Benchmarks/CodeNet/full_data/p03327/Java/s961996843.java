import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt();
    	
    	if(N<=999) {
    		System.out.println("ABC");
    		
    	}else {
    		System.out.println("ABD");
    	}

    }
}

