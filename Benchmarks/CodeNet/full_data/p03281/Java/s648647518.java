import java.util.Scanner;
public class Main {
    static int isPerfectNumber(int num) {
        int sum = 1;
        for(int i = 1; i <= num / 2; i++) {
            if(num % i == 0) {
               // sum += i;
            	++sum;
            }
        }
        return sum;
    }
	public void run() throws Exception {
		int anw = 0;

	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int cont = 0;
	    for(int i=1;i<=N;i++){
	    	anw = isPerfectNumber(i);
	    	if(anw == 8 && i%2==1){
	    		++cont;
	    	}
	    }
	    


	    System.out.println(cont);
	}
    public static void main(String[] args) throws Exception {
        new Main().run();
    }

}