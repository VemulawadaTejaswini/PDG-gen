import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc095_c();
	}

  
  	public static void solve_abc095_c(){

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int ans_a = 0;
		int ans_b = 0;
		int ans_ab = 0;
		int ans_price = 0;

		int tmp_ans_a = 0;
		int tmp_ans_b = 0;
		int tmp_ans_ab = 0;
		int tmp_ans_price = 0;

		// all a & all b
		tmp_ans_a = X;
		tmp_ans_b = Y;
		tmp_ans_ab = 0;
		tmp_ans_price = A * tmp_ans_a + B * tmp_ans_b + C * tmp_ans_ab;
		
		ans_price = tmp_ans_price;
		
		// ab & a
		if(X > Y){
			tmp_ans_a = X -Y;
			tmp_ans_b = 0;
			tmp_ans_ab = Y * 2;
			tmp_ans_price = A * tmp_ans_a + B * tmp_ans_b + C * tmp_ans_ab;
			
			ans_price = Math.min(ans_price, tmp_ans_price);
		}
		// ab & b
		else if(X < Y){
			tmp_ans_a = 0;
			tmp_ans_b = Y - X;
			tmp_ans_ab = X * 2;
			tmp_ans_price = A * tmp_ans_a + B * tmp_ans_b + C * tmp_ans_ab;

			ans_price = Math.min(ans_price, tmp_ans_price);
		}
		
		// all ab
		tmp_ans_a = 0;
		tmp_ans_b = 0;
		tmp_ans_ab = Math.max(X, Y) * 2;
		tmp_ans_price = A * tmp_ans_a + B * tmp_ans_b + C * tmp_ans_ab;

		ans_price = Math.min(ans_price, tmp_ans_price);
		
		System.out.println(ans_price);
		
		sc.close();

	}
}