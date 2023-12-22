import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	sc.close();
    	int ans = 0;
    	int t1 = N % 2 == 1 ? N * ((N-1)/2) : N/2 * (N-1);
    	ans = t1 + M;
    	System.out.println(ans);
    }

}