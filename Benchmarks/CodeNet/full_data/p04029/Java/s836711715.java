import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cont = 0;
		for(int i = scn.nextInt();i>0;i--) {
			cont+=i;
		}System.out.println(cont);
		scn.close();
	}
}