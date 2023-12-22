import java.util.ArrayList;
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

    	int N=sc.nextInt();
    	int L=sc.nextInt();
    	List<String> data=new ArrayList<String>();

    	for(int i=0;i<N;i++) {

    		data.add(sc.next());
    	}

    	data.sort(null);

    	for(String str:data) {
    		System.out.print(str);
    	}

    	System.out.println();


    }
}


