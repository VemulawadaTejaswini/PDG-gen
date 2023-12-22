import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long powMonster = sc.nextLong();
		
		// 攻撃loop
		long attacks = attackMonsters(powMonster);
		
		log(attacks);
		sc.close();
	}
	
	static long attackMonsters(long powMonster) {
		long attacks = 0;
		if(powMonster == 1) {
			attacks=1;
		}
		else {
			long pow1;
			pow1 = (powMonster)/2;
			attacks = attackMonsters(pow1) * 2 + 1;
		}
		return attacks;
	}
	
	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}

	static void log(long i) {
		System.out.println(i);
	}

	static void log(double d) {
		System.out.printf("%.12f\n",d);
	}
	
}
