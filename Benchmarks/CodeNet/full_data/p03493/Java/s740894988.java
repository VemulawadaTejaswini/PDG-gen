import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		if (S == 111) {
			System.out.println("3");
		} else if (S == 110 || S == 101 || S == 011) {
			System.out.println("2");
		} else if (S == 100 || S == 010 || S == 001) {
			System.out.println("1");
		}
	}
}