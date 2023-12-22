import java.util.Scanner;
public class Main {
	public static Scanner sc = new Scanner(System.in);
    public void run() throws Exception {

    	int N = sc.nextInt();
    	int anw = 100000;
    	for(int i=2; i<N/2; i++){
    		//for(int j=2; j<N; j++){
    			if(i+(N-i) == N){
        			int num1 = findSumOfDigits(i);
        			int num2 = findSumOfDigits(N-i);
        			int sum = num1 + num2;
        			anw = Math.min(sum,anw);

    			}
    		//}

    	}
    	System.out.println(anw);

    }
    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    int findSumOfDigits(int n) {
    	  int sum = 0;
    	  while (n > 0) { // n が 0 になるまで
    	    sum += n % 10;
    	    n /= 10;
    	  }
    	  return sum;
    	}
}