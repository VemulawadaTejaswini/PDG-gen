import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		Set<Integer> waters = new HashSet<>();
		Set<Integer> sugers = new HashSet<>();
		for(int i = 0 ; i <= a ; i++) {
			for(int j = 0 ; j <= b ; j++) {
				if(i * 100 + j * 100 <= f) waters.add(i * 100 + j * 100);
			}
		}
		for(int i = 0 ; i <= f ; i++) {
			for(int j = 0 ; j <= f ; j++) {
				if(i < j && i + j <= f) sugers.add(i + j);
			}
		}
		int w = 1;
		int s = -1;
		for(int water : waters) {
			for(int suger : sugers) {
				if(water + suger <= f && e * water >= 100 * suger && suger * w > water * s) {
					w = water;
					s = suger;
				}
			}
		}
		System.out.println(waters);
		System.out.println(sugers);
		System.out.println(s + w + " " + s);
	}
}