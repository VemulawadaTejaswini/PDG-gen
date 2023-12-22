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

		solve_abcPpc_d();
	}
  
  	public static void solve_abcPpc_d(){

		Scanner sc = new Scanner(System.in);
		
		String a = "abcdefghijklmnopqrstuvwxyz";
		Queue<String> q1 = new ArrayDeque<String>();
		
		int N = sc.nextInt();
		q1.add("");
		
		for(int i=0;i<N;i++){
			
			Queue<String> q2 = new ArrayDeque<String>();

			while(!q1.isEmpty()){
				q2.add(q1.poll());
			}
			
			while(!q2.isEmpty()){
				
				String s = q2.poll();
				
				for(int j=0;j<=i;j++){
					q1.add(s + a.charAt(j));
				}
				
			}
		}
		
		while(!	q1.isEmpty()){
			System.out.println(q1.poll());
		}
		
		sc.close();

	}
}