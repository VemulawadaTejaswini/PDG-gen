
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		int k = Integer.parseInt(sc.next());
		String[] split = s.split("");
		String judge = split[k-1];
		String result = "";
		for(int i=0;i<n;i++) {
			if(split[i].equals(judge)) {
				result = result + judge;
			}else {
				result = result + "*";
			}
		}
		System.out.println(result);
	}

}
