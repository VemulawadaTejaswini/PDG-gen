import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		ArrayList<Integer> array = new ArrayList<>();

		String[] str1 = br.readLine().split(" ");
		int a[] = new int [n];
		for(int i = 0; i < n; i++){
			a[i] = Integer.parseInt(str1[i]);
			array.add(a[i]);
		}

		while(true){
			boolean end = true;
			int size = array.size();
			for(int i = 0; i < size; i++){
				for(int j = i+1; j < size; j++){
					int a1 = array.get(i);
					int a2 = array.get(j);
					int abs = Math.abs(a1-a2);
					if(!array.contains(abs)){
						array.add(abs);
						end = false;
					}
				}
				if(array.contains(k)){
					System.out.println("POSSIBLE");
					return;
				}
			}
			if(end){
				System.out.println("IMPOSSIBLE");
				return;
			}
		}
	}
}