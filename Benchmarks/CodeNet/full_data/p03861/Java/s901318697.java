import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	long a = scan.nextLong();
	long b = scan.nextLong();
	long x = scan.nextLong();

	long count = (b/x)-((a-1)/x);

	System.out.println(count);
    }
}
