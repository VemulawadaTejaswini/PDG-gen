import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stu = new int[n];
		int[] res = new int[n];
		for(int i = 0; i < n; i++){
			stu[i] = sc.nextInt();
		}
		for(int i = 1; i < n+1;i++){
			for(int j = 0; j < n; j++){
				if(stu[j] == i){
					res[i - 1] = j + 1;
					break;
				}
			}
		}
		for(int i: res){
			System.out.print(i + " ");
		}
	}
}