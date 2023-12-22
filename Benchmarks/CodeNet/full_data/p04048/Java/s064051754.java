import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong(), x = s.nextLong();
		long ans = 0;
		ans += n-x;
		ans += 3*x;
		ans += n-x;
		System.out.println(ans);
	}
}
