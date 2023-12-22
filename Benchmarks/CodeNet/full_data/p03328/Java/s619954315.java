import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    sc.close();
	    
	    int i = b - a; //何番目の塔か
	    int answer = i * (i + 1) / 2 - b;
	    
	    System.out.println(answer);
	    System.exit(0);
	}
}