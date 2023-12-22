import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] list = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int result=0;
		int max_result=0;
		
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				result = gcd(list[i],list[j]);
				max_result = Math.max(max_result, result);
			}
		}
		System.out.println(max_result);
	}
	
	public static int gcd(int a,int b) {
        if(b == 0){
            return a;
        }else{
            return gcd(b, a%b);
        }		
	}
}
