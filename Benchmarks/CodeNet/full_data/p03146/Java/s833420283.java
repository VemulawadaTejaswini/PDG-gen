import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);

    	// 入力
    	int s = sc.nextInt();
    	ArrayList<Integer> arg = new ArrayList<>();
    	arg.add(s);
    	//int[] arg = new int[1000000];
    	//arg[0] = s;
    	int i;

    	for (i = 1; i <= 1000000; i++ ){
        	if(s / 2 == 0){
        		arg.add(s / 2);
        		//arg[i] = s / 2;
        	} else {
        		arg.add(3 * s + 1);
        		//arg[i] = 3 * s + 1;
        	}

        	for (int j = 0; j < i-1; i++ ) {
        		if (arg.get(j) == s) {
        		//if (arg[j] == s) {
        			break;
        		}
        	}

    	}

    	// 出力
    	System.out.println(i);
    }
}