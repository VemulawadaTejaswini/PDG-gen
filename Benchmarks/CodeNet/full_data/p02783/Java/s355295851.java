import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt(),w=sc.nextInt();;
		//long n=sc.nextLong(),y=sc.nextLong();
		int count=0;
		while(h-w*count>0)count++;
		System.out.println(count);

	}

}
