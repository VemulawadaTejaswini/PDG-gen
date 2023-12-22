import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	String S=sc.nextLine();
    	
    	S=S.replaceAll(","," ");
    	
    	System.out.println(S);
    }
}
