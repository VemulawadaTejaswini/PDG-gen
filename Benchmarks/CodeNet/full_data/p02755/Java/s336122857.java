import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc158_c();
	}
  
  	public static void solve_abc158_c(){

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = -1;
		
		for(int i=1;i<=1250;i++){
			
			int c = (int)Math.floor(i * 0.08);
			int d = (int)Math.floor(i * 0.1);
			
			if(c == A && d == B){
				ans = i;
				break;
			}
			
		}
		System.out.println(ans);

		sc.close();

	}
}