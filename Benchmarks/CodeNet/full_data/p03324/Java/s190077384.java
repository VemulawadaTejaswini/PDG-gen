import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
		int[] input = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
		while(input[0] / 100 >= 100) input[0] /= 100;
		System.out.println((int)(input[1]* Math.pow(100, input[0])));
	}

}