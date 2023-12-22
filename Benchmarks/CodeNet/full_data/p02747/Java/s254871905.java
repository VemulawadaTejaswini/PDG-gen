import java.util.Scanner;

class Main {
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);

	String str = stdIn.next();

	int x = str.indexOf("hi");

	if (x == 0) System.out.print("Yes");
	else System.out.print("No");

    }
}