import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);

    	Scanner sc = new Scanner(System.in);

    	int N = sc.nextInt();

    	if(N%2==0) {
        	System.out.println(N/2);
    	} else {
        	System.out.println(N/2+1);
    	}

    }
}