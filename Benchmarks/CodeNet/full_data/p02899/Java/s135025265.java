import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int resultArray[] = new int[num];

		for(int i = 0; i < num; i++) {
			int existStudentNum = sc.nextInt();
			resultArray[existStudentNum-1] = i+1;
		}

		for (int result : resultArray) {
		    System.out.print(result + " ");
		}
		sc.close();
	}
}
