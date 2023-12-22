import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String str = null;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			str = br.readLine();
		} catch (IOException e) {
			return;
		}
		
		int num = 0;
		for (int i = 0; i< 4; i++) {
			if (str.charAt(i) == '+') num++;
			else num--;
		}
		System.out.println(num);
	}
}
