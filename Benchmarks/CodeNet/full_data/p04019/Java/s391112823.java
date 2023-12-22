import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	String S=sc.next();

    	String[] s=S.split("");

    	boolean hasS=false;
    	boolean hasN=false;
    	boolean hasW=false;
    	boolean hasE=false;

    	for(int i=0;i<s.length;i++) {

    		if(s[i].equals("S")) {
    			hasS=true;
    		}else if(s[i].equals("N")) {
    			hasN=true;
    		}else if(s[i].equals("W")) {

    			hasW=true;

    		}else {
    			hasE=true;
    		}

    	}

    	boolean inX=(hasS==hasN);
    	boolean inY=(hasW==hasE);

    	if(inX && inY) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}

    }


}

