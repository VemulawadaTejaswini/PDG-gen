import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int N = sc.nextInt();
    	int K = sc.nextInt();

    	int q = K;
    	int count = 1;

    	while(q<=N) {
    		q *=K;
    		count++;
    	}
    	System.out.println(count);

    }

}