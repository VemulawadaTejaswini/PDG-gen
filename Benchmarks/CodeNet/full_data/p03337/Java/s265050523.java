import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	
    	int A=sc.nextInt();
    	int B=sc.nextInt();
    	
    	int  add=A+B;
    	int minus=A-B;
    	int mult=A*B;
    	
    	int result=Math.max(add,Math.max(minus,mult));
    	
    	System.out.println(result);

    }
}

