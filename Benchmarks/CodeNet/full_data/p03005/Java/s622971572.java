import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int res;
if(K==1){
    res = 0;
}else{
    res = N-K;
}
        
        System.out.println(res);
        }
    }