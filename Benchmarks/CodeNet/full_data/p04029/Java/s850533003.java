import java.util.Scanner;
class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int students = sc.nextInt();
		int total=0;
		for(int i=1;i<=students;i++) {
			total+=i;
		}
		System.out.println(total);
	}
}