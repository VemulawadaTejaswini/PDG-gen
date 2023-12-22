import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//
		int n = sc.nextInt();
		String result = "No";
		loop:
		for(int i=1; i<10; i++){
			for(int j=1; j<10; j++){
				if(i * j == n){
					result = "Yes";
					break loop;
				}
			}
		}
		System.out.println(result);
	}
}
