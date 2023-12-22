import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int n = sc.nextInt();

    	int nHalf = n / 2;
    	int shou;
    	int i;

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