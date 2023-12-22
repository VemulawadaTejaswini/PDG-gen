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

		solve_abcPpc_b();
	}
  
  	public static void solve_abcPpc_b(){

		Scanner sc = new Scanner(System.in);
		
		long H = sc.nextInt();
		long W = sc.nextInt();
		long ans = 0;
		
		if((W % 2 == 0) || (H % 2 == 0)){
			ans = (H * W ) / 2;
		}
		else{
			ans = (H * W + 1) / 2;
		}

		System.out.println(ans);
		
		sc.close();

	}
}