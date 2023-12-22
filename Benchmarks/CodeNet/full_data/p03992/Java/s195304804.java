import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	String s=sc.nextLine();

    	String pre=s.substring(0,4);
    	String sub=s.substring(4);

    	String result=pre+" "+sub;

    	System.out.println(result);


    }
}

