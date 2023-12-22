import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader in = new BufferedReader(new FileReader(new File("input.txt")));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in.readLine();
		StringBuilder s = new StringBuilder(in.readLine());
		StringBuilder b = new StringBuilder(s.toString());
		int numA = 0;
		for(int i = 0; i< s.length()-1; i++) {
			if(i==0&&s.charAt(0) =='.'){continue;}
			if(s.charAt(i) == '#' &&  s.charAt(i+1) == '.') {
				numA++;
				s=s.deleteCharAt(i+1);
				s=s.insert(i+1, '#');
			}
		}
		int numB = 0;
		for(int i = 0; i< b.length(); i++) {
			//if(i==1&&b.charAt(0) =='.'){continue;}
			if(b.charAt(i) == '#') {
				numB++;
			}
		}
		System.out.println(numA<numB?numA:numB);
	}
}
