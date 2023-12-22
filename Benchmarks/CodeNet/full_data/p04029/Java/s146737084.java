import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();
    	
    	int sum=N*(N+1)/2;
    	
    	System.out.println(sum);
    }
}
