import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc150_b();
	}
  
  	public static void solve_abc150_b(){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String S = sc.next();
		String keyword = "ABC";
		int count = 0;
		
		for(int i=0;i<N-(keyword.length()-1);i++){
			
			if(S.substring(i, i+keyword.length()).equals(keyword)){
				count++;
				i += keyword.length() - 1;
			}
		}
		
		System.out.println(count);
		sc.close();
		
	}
}