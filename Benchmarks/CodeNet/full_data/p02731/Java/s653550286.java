import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		double val = Math.ceil(n/3);
		double val1 = (val*val*val);
		System.out.println(val1);
		

	}

}