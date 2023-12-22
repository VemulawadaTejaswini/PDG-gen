import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	int R=sc.nextInt();
    	int G=sc.nextInt();

    	int result=2*G-R;

    	System.out.println(result);

    }
}

//g=a+b/2→2g-r
//(2002+x)/2=2017