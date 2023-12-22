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

    	int sum=a+b;

    	if(sum>=10) {
    		System.out.println("error");
    	}else {
    		System.out.println(sum);
    	}
    }
}
