import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);
    	
    	String s=sc.next();
    	
    	int counter=0;
    	for(String str:s.split("")){
    		if(str.equals("1")) {
    			counter++;
    		}
    	}
    	
    	System.out.println(counter);
    }

}





