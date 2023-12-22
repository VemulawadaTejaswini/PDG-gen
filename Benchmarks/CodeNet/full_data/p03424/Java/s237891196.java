import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	String N=sc.nextLine();

    	String[] S=sc.nextLine().split(" ");

    	Set<String> set=new TreeSet<String>();

    	for(int i=0;i<S.length;i++) {
    		set.add(S[i]);
    	}



    	if(set.size()==4) {
    		System.err.println("Four");
    	}else {
    		System.out.println("Three");
    	}

    }



}

