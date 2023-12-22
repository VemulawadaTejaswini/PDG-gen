import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int count = 0;
		for(int i=0; i<n-2; i++){
			if(s.substring(i, 3).equals("ABC")){
				count++;
			}
		}
		System.out.println(count);
	}
}
