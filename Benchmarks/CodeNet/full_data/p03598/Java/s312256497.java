import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
          		int sum = 0;
                int N = sc.nextInt();
                int K = sc.nextInt();
                for(int i = 1;i<= N;i++){
                	int x = sc.nextInt();
                  	if(x > Math.abs(x - K)){
                      sum = sum + 2 * Math.abs(x-K);
                    }else{
                    	sum = sum + 2 * x;
                    }
                }
                System.out.println(sum);
        }
    }
}