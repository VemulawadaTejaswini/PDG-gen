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
    	int t1 = calcNumOfCombination(N, 2);
    	int t2 = calcNumOfCombination(M, 2);
    	ans = t1 + t2;
    	System.out.println(ans);
    }

	static int calcNumOfCombination(int n, int r){
	    int num = 1;
	    for(int i = 1; i <= r; i++){
	        num = num * (n - i + 1) / i;
	    }
	    return num;
	}
}