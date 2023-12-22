import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);
    	String S=sc.next();

    	int first=S.indexOf("A");
    	int last=S.lastIndexOf("Z");

    	int result=last-first;

    	System.out.println(result+1);
    }

}

