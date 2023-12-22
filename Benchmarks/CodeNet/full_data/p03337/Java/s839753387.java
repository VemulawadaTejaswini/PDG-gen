import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int A = scn.nextInt();
		int B = scn.nextInt();
		
		System.out.println(Math.max(Math.max(A+B, A-B), A*B));
	}
}
