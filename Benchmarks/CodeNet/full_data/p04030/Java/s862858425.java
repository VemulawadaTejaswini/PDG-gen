import java.util.List;
import java.util.Scanner;



public class Main {


	static List<Integer> ansset;

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	String S=sc.next();

    	String[] input=S.split("");

    	String result="";

    	for(int i=0;i<input.length;i++) {

    		if(input[i].equals("B")) {

    			if(result.length()>0) {
    				result=result.substring(0, result.length()-1);
    			}

    		}else {

    			result+=input[i];
    		}

    	}

    	System.out.println(result);

    }
}

