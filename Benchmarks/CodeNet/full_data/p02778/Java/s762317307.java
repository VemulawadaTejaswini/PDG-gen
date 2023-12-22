import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		String x = "";
		for(int i=0;i<s.length();i++){
			x = x + "x";
		}
		System.out.println(x);
	}
}