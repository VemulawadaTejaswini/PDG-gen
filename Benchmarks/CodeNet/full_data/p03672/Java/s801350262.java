import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	String S=sc.next();

    	for(int i=1;i<S.length();i++) {

    		String buf=S.substring(0,S.length()-i);

    		if(Judge(buf)==true) {
    			System.out.println(S.length()-i);
    			return;
    		}

    	}

    }

    public static boolean Judge(String str) {


    	String[] buf=str.split("");

    	if(buf.length%2==1) {
    		return false;
    	}else {

    		for(int i=0;i<buf.length/2;i++) {

    			if(!buf[i].equals(buf[i+buf.length/2])) {
    				return false;
    			}
    		}

    	}

    	return true;

    }

}

