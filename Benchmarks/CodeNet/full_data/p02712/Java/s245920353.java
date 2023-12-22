
import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        //入力
    	Scanner sc = new Scanner(System.in);
    	int val = sc.nextInt();
    	double sum = 0;
    	for(int i =1; i <= val; i++) {
    		if(i % 3 != 0 && i % 5 !=0) {
    			sum += i;
    		}
    	}
    	System.out.println(BigDecimal.valueOf(sum).setScale(0).toPlainString());
    }
}