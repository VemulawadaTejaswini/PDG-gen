import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();	

		int b = n*n - a;
		System.out.println(b);
	}
}
