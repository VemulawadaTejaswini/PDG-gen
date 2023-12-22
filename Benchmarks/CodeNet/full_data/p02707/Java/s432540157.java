import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] aA = new int[a];
		for(int i = 0; i < a-1;i++) {
			aA[sc.nextInt()-1] += 1;
		}
		for(int i:aA) {
			System.out.println(i);
		}
	}
}