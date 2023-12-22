import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int START = input.nextInt();
		int GOAL = input.nextInt();
		int diff = START-GOAL;
		System.out.println(START-2*diff);
	}
}