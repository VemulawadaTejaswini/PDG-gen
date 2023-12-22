import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	long n = sc.nextInt();

    	long nHalf = n / 2;
    	long shou;
    	long i;

    	for(i = nHalf; true; i++){
    		if (n % i == 0){
    			shou = n / i;
    			break;
    		}
    	}

    	// 出力
    	System.out.println(i +shou - 2);
    }
}