package compcoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class distinct_num {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(reader.readLine());
		String[] p = reader.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(Object t:p) {
			list.add(Integer.parseInt((String) t));
		}
		int k = 1;
		while(k<=a)	{
			System.out.println(solve(list,k));
			k++;
		}
		
		}
	
	@SuppressWarnings("unchecked")
	public static int solve(ArrayList a,int k) {
		Collections.sort(a);
		int i = 0;
		int res= 0;
		int p=i;
		while(i<a.size()) {
			int t= 0;
			while(t<k) {
				try{if(a.get(i+t)!=a.get(i+t-1)) {
					t++;
				}
				break;}
				catch(Exception e) { break;			}}
			if(t==k) { res++; i=i+k;}
			else i++;
		}
		return res;
	}
}
