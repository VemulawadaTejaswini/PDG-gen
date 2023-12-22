import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	String a=sc.next().substring(0,1);
    	String b=sc.next().substring(0,1);
    	String c=sc.next().substring(0,1);
    	
    	String result=a.toUpperCase()+b.toUpperCase()+c.toUpperCase();
    	
    	System.out.println(result);
    	
    }
}
