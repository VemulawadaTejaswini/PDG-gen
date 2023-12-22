import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] array = new int[m];
		for(int i = 0; i < m; i++){
			array[i] = scan.nextInt();
		}
		int asobi = n;
		for(int i = 0; i < m; i++){
			asobi -= array[i];
		}
		if(asobi < 0){
			asobi = -1;
		}
		System.out.println(asobi);
	}
}