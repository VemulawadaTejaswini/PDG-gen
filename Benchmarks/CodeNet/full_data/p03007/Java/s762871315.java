
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		List <Integer> pos = new ArrayList <Integer>();
		List <Integer> neg = new ArrayList <Integer>();
		
		for(int i = 0 ; i < n ; i++) {
			int a = Integer.parseInt(sc.next());
			if(a >= 0) {
				pos.add(a);
			}
			else {
				neg.add(a);
			}
		}
		
		Collections.sort(pos);
		Collections.sort(neg);
		
		int [][]ope = new int [n][2];
		int max = -1;
		int min = -1;
		
		if(!pos.isEmpty() && !neg.isEmpty()) {
			 max = pos.get(pos.size()-1);
			 min = neg.get(0);
			
			pos.remove(pos.size()-1);
			neg.remove(0);
			
			int m = neg.size();
			int l = pos.size();
			
			for(int i = 0 ; i < m ;i++) {
				ope[i][0] = max;
				ope[i][1] = neg.get(i);
				max = ope[i][0] - ope[i][1];
			}
			
			for(int i = 0 ; i < l ;i++) {
				ope[i+m][1] = pos.get(i);
				ope[i+m][0] = min;
				min = ope[i+m][0] - ope[i+m][1];
			}
			
			ope[n-2][0] = max;
			ope[n-2][1] = min;
			
		}
		
		else if(pos.isEmpty()) {
			min = neg.get(0);
			max = neg.get(neg.size()-1);
			neg.remove(neg.size()-1);
			neg.remove(0);
			
			int m = neg.size();
			
			for(int i = 0 ; i < m ;i++) {
				ope[i][0] = max;
				ope[i][1] = neg.get(i);
				max = ope[i][0] - ope[i][1];
			}
			
			ope[n-2][0] = max;
			ope[n-2][1] = min;
		}
		else {
			min = pos.get(0);
			max = pos.get(pos.size()-1);
			pos.remove(pos.size()-1);
			pos.remove(0);
			
			int m = pos.size();
			for(int i = 0 ; i < m ;i++) {
				ope[i][0] = min;
				ope[i][1] = pos.get(i);
				min = ope[i][0] - ope[i][1];
			}
			ope[n-2][0] = max;
			ope[n-2][1] = min;
			
		}
		
		System.out.println(max - min);
		for(int i = 0 ; i < n-1 ;i++) {
			System.out.println(ope[i][0]+" "+ope[i][1]);
		}
	}

}
