import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

	static void op(String s) {
        
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	int res = 0;
        char[] s = scanner.nextLine().toCharArray();
        for (int i = 1; i < s.length; i++) {
        	if (s[i - 1] == 'B' && s[i] == 'W') {
        		s[i - 1] = 'W';
        		s[i] = 'B';
        		res++;
        		i = 0;
        	}
        }
        System.out.println(res);
        scanner.close();
    }
}