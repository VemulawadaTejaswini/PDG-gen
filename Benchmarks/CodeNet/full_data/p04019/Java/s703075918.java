import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		boolean north = false;
		boolean south = false;
		boolean west = false;
		boolean east = false;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'N') {
				north = true;
			} else if(s.charAt(i) == 'S') {
				south = true;
			} else if(s.charAt(i) == 'W') {
				west = true;
			} else {
				east = true;
			}
		}
		if((north && south && !east && !west) || (east && west && !north && !south) || (east && west && north && south)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
