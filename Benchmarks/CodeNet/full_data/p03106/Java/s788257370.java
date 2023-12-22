import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        int r = 1;
        List<Integer> result = new ArrayList();
        for(int i = 1;i <= 100;i++) {
        	if(A % i == 0 && B % i == 0) {
        		result.add(i);
            	if(result.size() == K) {
            		r = i;
            		break;
            	}
        	}
        }
        System.out.println(r);
	}
}
