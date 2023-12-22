import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();
		System.out.println(7 - "SUNMONTUEWEDTHUFRISAT".indexOf(s)/3);
	}
}

