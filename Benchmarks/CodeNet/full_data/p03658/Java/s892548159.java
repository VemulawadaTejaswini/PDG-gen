import java.io.*;
import java.util.*;

public class Main {
	public static Scanner stdIn = new Scanner(System.in);
	public static void main(String[] args){
		String L1 = stdIn.nextLine();
		String L2 = stdIn.nextLine();
		String[] s1 = L1.split(" ", 0);
		String[] s2 = L2.split(" ", 0);
		Arrays.sort(s2, Comparator.reverseOrder());
		int r=0;
		for (int i=0;i<Integer.parseInt(s1[1]);i++){
			 r+=Integer.parseInt(s2[i]);
		}
		System.out.println(r);
	}
}