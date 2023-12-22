import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);
    	int K=sc.nextInt();
    	int T=sc.nextInt();

    	List<Integer> A=new ArrayList<Integer>();

    	for(int i=0;i<T;i++) {
    		A.add(sc.nextInt());
    	}

    	Collections.sort(A,Collections.reverseOrder());

    	int at=A.get(0);

    	int result=Math.max(at-1-(K-at),0);

    	System.out.println(result);


    }

}

