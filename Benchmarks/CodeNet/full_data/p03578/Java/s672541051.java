import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] d = new int [n];
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			list.add(Integer.parseInt(str[i]));
		}
		int m = Integer.parseInt(br.readLine());
		String[] str2 = br.readLine().split(" ");
		for(int i = 0; i < m; i++){
			int t = Integer.parseInt(str2[i]);
			if(list.contains(t)){
				list.remove(t);
			}else{
				System.out.println("NO");
			}
		}
		System.out.println("YES");
	}
}