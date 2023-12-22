import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	StringBuilder sb1=new StringBuilder();
    	StringBuilder sb2=new StringBuilder();
    	sb1.append(sc.next());
    	sb2.append(sc.next());


    	if(sb1.toString().equals(sb2.reverse().toString())) {
    		System.out.println("YES");
    	}else {
    		System.out.println("NO");
    	}

    }
}

