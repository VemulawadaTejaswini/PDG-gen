import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	String dd=sc.next();
    	String S=sc.next();
    	
    	String result="A"+S.substring(0, 1)+"C";
    	
    	System.out.println(result);
    }
}
