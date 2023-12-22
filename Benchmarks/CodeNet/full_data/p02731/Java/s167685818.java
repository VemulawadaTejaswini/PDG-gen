import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		float a = L/3;
		float b = (L-a)/2;
		float c = L - a - b ;
		float valume = (a*b*c)/1;
		System.out.println(valume);
	}
}
