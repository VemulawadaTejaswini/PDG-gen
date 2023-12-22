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

		solve_abc159_c();
	}
  
  	public static void solve_abc159_c(){

		Scanner sc = new Scanner(System.in);

		double L = sc.nextDouble();
		
		double ans = L * L * L / 27.0000000000;
		
		System.out.println(String.format("%7f", ans));

		sc.close();

	}
}