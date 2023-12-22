import java.util.*;

public class Main {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int w = Integer.parseInt(args[1]);
		int b = (n * n) - w;
		System.out.println(b);
	}
}