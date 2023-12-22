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

		solve_abc158_b();
	}
  
  	public static void solve_abc158_b(){

		Scanner sc = new Scanner(System.in);
		
		//x = Math.floor(N / (A + B))
		
		//y = N % (A + B) - A
		
		
		long N = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long x = Math.floorDiv(N, a+b) * a;
		long y = (N % (a + b));
		
		if(y > a) y = y - a;
		
		long ans = x + y;
		System.out.println(ans);


		sc.close();

	}
}