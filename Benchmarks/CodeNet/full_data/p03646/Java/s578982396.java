import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long K = sc.nextLong();
		if(K % 2 == 1)
			System.out.println(2 + "\n" + K/2 + " " + (K/2+3));
		else
			System.out.println(2 + "\n" + K/2 + " " + (K/2+1));
	}

}