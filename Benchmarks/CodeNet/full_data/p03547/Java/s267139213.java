package myPackage.main;
import java.util.*;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String firstString = sc.next();
		String secondString = sc.next();
		if(hoge(firstString) < hoge(secondString)) {
			System.out.println("<");
		}else if(hoge(firstString) == hoge(secondString)) {
			System.out.println("=");
		}else System.out.println(">");

	}
	static int hoge(String x) {
		if(x=="A") {
			return 10;
		}
		else if(x=="B") {
			return 11;
		}
		else if(x=="C") {
			return 12;
		}
		else if(x=="D") {
			return 13;
		}
		else if(x=="E") {
			return 14;
		}
		else if(x=="F") {
			return 15;
		}
		else return -1;
	}

}
