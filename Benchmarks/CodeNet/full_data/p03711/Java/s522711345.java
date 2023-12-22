import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        String x=sc.next();
        String y=sc.next();
        String k1="1,3,5,7,8,10,12";
        String k2="4,6,8,11";
        if(k1.contains(x) &&k1.contains(y)) System.out.println("Yes");
        else if(k2.contains(x)&&k2.contains(y)) System.out.println("Yes");
        else System.out.println("No");

	}
}
