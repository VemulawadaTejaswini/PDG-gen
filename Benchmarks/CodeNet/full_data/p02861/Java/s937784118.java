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
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc145_c();
	}
  
  	public static void solve_abc145_c(){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		double[] x = new double[N];
		double[] y = new double[N];
		
		for(int i=0;i<N;i++){
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}
		
		double[][] dist = new double[N][N];
		
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				dist[i][j] = dist[j][i] = Math.sqrt((x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i]));
			}
		}
		
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<N;i++) sb.append(i);
		
		List<String> townList = new ArrayList<>();
		solve_abc145_c_permtation("",sb.toString(),townList);

		//for(String ti:townList) System.out.println(ti);

		
		
		double sum = 0;
		double count = (double)townList.size();
		
		for(String ti:townList){
			for(int i=0;i<ti.length()-1;i++){
				int startTown = Character.getNumericValue(ti.charAt(i));
				int endTown = Character.getNumericValue(ti.charAt(i+1));
				//System.out.println("startTown:" + startTown + "\t endTown:" + endTown);
				sum += dist[startTown][endTown];
				
				//System.out.println("sum:"+sum+"\t count:"+count);
				
			}
		}
		
		double ans = sum / count;
		System.out.println(ans);
		sc.close();

	}
	
	public static void solve_abc145_c_permtation(String ans, String rest, List<String> ansArray){
		
		if(rest.length() == 1){
			ansArray.add(ans + rest);
		}
		
		//new ans  = ans  + rest[i]: String ans  = ans  + rest.charAt(i)
		//new rest = rest - rest[i]: String rest = rest[0,i] + rest[i,]
		for(int i=0;i<rest.length();i++){
			solve_abc145_c_permtation(ans + rest.charAt(i), rest.substring(0,i) + rest.substring(i+1), ansArray);
		}
	}
}