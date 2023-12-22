import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String[] day = {"SAT","FRI","THU","WED","TUE","MON","SUN"};
			for(int i = 0; i < day.length; i++) {
				if(in.equals(day[i])) {
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}