import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		long x = io.nextLong();
		System.out.println(x/11*2+(x%11/7+1));
	}
}