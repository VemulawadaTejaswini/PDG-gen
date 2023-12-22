import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	int X=sc.nextInt();
    	int A=sc.nextInt();
    	int B=sc.nextInt();

    	if(B-A<=0) {
    		System.out.println("delicious");
    	}else if(B-A<=X) {
    		System.out.println("safe");
    	}else {
    		System.out.println("dangerous");
    	}
    }
}
