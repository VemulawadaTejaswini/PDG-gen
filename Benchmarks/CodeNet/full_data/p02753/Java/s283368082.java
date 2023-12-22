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

		solve_abc158_a();
	}
  
  	public static void solve_abc158_a(){

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		
		boolean a = false;
		boolean b = false;
		
		for(int i=0;i<3;i++){
			
			if(s.charAt(i) == 'A') a = true;
			if(s.charAt(i) == 'B') b = true;
		}

		if(a && b) System.out.println("Yes");
		else System.out.println("No");

		

		sc.close();
	}
}