import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {		

		try(BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in))) {
			String[] input = br.readLine().split("\\s");
			Optional<Integer> N = Optional.ofNullable(Integer.parseInt(input[0]));
			Optional<Integer> K = Optional.ofNullable(input.length > 1 ? Integer.parseInt(input[1]) : null);
			
			if(!K.isPresent()) {
				K = Optional.of(Integer.parseInt(br.readLine()));
			}
			
			if(K.get() < 1) { K = Optional.of(1); }
			if(K.get() > 50) { K = Optional.of(50); }

			if(N.get() < 1) { N = Optional.of(1); }
			if(N.get() > 50) { N = Optional.of(50); }
			
			int output = (N.get() - K.get()) + 1;
			
			System.out.println(output);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}