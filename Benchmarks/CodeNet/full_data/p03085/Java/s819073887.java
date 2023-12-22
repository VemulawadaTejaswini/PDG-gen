import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		char a = '0';
		switch (c) {
			case 'A':
			a = 'T';
			break;
			case 'T':
			a = 'A';
			break;
			case 'G':
			a = 'C';
			break;
			case 'C':
			a = 'G';
			break;
		}
		System.out.println(a);
	}
}
