import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int N = sc.nextInt();

    	String s = String.valueOf(N);

    	boolean flag = s.contains("7");

    	if(flag) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}


    }
}
