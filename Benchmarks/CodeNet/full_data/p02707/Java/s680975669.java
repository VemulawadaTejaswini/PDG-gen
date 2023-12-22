import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] emp = new int[n];
		for(int i = 0; i < n-1; i++){
			emp[sc.nextInt() - 1] ++;
		}
		for(int i = 0; i < n; i++){
			System.out.print(emp[i]);
		}
		
	}
}