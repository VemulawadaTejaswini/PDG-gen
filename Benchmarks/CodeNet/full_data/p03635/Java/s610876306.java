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

    	int result=(a-1)*(b-1);

    	System.out.println(result);
    }
}
