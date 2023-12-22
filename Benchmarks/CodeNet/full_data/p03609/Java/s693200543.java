import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);
    	
    	int x=sc.nextInt();
    	int t=sc.nextInt();
    	
    	int result=Math.max(x-t,0);
    	
    	System.out.println(result);
    }
}
