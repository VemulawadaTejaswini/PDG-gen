import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
public class Main {
    public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] input = br.readLine().split(" ");
			System.out.println(Math.abs(Long.parseLong(input[0]) - Long.parseLong(input[1])) <= 1 ? "Brown" : "Alice");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}