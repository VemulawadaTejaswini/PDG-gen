import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);

    	Scanner sc = new Scanner(System.in);

    	String S = sc.next();

    	if(S.equals("AAA")||S.equals("BBB")) {
    		System.out.println("No");
    	} else {
    		System.out.println("Yes");
    	}
    }
}