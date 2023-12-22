package main;


import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;



public class Main {
	
	private static int[] arr;
	private int[][] ar2;
	private List<Integer> list;
	public static int n,m,k;
	private HashSet<Integer> set;
	private HashMap<Integer, Integer> map;
	//private Scanner sc;

//	

	public static void main(String[] args){
		
		//new Main().setVisible(true);]
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++){
			if(sum+i>=n){
				System.out.println(i);
				return;
			}
			sum += i;
		}
		
		//int ans =0;
		
		
		
		//System.err.println(ans);
	}




}
