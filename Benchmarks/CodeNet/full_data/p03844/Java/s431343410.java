import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	int A=sc.nextInt();
    	String op=sc.next();
    	int B=sc.nextInt();
    	
    	int result=0;
    	
    	if(op.equals("+")) {
    		result=A+B;
    	}else {
    		result=A-B;
    	}
    	
    	System.out.println(result);
    	
    }
}
