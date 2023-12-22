import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	String[] S=sc.next().split("");
    	String[] target="CODEFESTIVAL2016".split("");
    	
    	
    	int cnt=0;
    	
    	for(int i=0;i<S.length;i++) {
    		
    		if(!S[i].equals(target[i])) {
    			cnt++;
    		}
    		
    	}
    	
    	System.out.println(cnt);

    }
}

