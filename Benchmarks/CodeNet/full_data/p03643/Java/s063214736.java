import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);
    	
    	String N=sc.next();
    	
    	String result="ABC"+N;
    	
    	System.out.println(result);


    
    }
}

