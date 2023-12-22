import java.util.Scanner;

public class Main{
	public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String w = "SUNMONTUEWEDTHUFRISAT";
        String s = scanner.next();
        int i = w.indexOf(s) / 3;
        System.out.println(7 - i);
    }
}
