import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
 
 public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
		//inputs
		int n = input.nextInt();
		int m = input.nextInt();
		int sum = 0;
		for(int i = 0 ; i < m ; i++)
			sum += input.nextInt();
		
		System.out.println(n >= sum ? n - sum : -1);
	}
}