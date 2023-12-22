import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
public class Main {
    public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] input = br.readLine().split(" ");
			long A = Long.parseLong(input[0]);
			long B = Long.parseLong(input[1]);
			System.out.println(algorithm(Math.max(A, B), Math.min(A, B)) == 1 ? "Brown" : "Alice");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
    private static int algorithm(long A, long B){
		if(A < 2){
			return 1;
		}else{
			B += A / 2;
			A = A % 2;
			return (algorithm(B, A) == 0) ? 1 : 0;
		}
	}
}