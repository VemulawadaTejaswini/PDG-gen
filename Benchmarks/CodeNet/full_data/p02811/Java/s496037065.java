import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int K = sc.nextInt();
    	int X = sc.nextInt();
    	sc.close();
    	System.out.println(500*K >= X ? "Yes" : "No");
    }
}