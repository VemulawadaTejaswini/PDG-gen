

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		String[] nab = str.split(" ");
		int n = Integer.parseInt(nab[0]);
		int a = Integer.parseInt(nab[1]);
		int b = Integer.parseInt(nab[2]);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<n; i++){
			str = input.readLine();
			list.add(Integer.parseInt(str));

		}

		Collections.sort(list, Comparator.reverseOrder());

		int last = 0;
		int temp= 0;
		int count = 0;
		ArrayList<Integer> remove = new ArrayList<Integer>();

		while(list.size() > 0){
			count++;
			last = list.get(0) - a;
			list.set(0, last);
			for(int i=1; i<list.size()-1; i++){
				temp = list.get(i) - b;
				if(list.get(i) - b > 0){
					list.set(i, temp);
				}else{
					for(int j=1; j<list.size()-i; j++){
						remove.add(list.get(i+j));
					}
					list.removeAll(remove);
				}
			}
			if(list.size() > 2 &&  list.get(0) < list.get(1)){
				temp = list.get(0);
				list.set(0, list.get(1));
				list.set(1, temp);
			}
		}
		System.out.println(count);
	}
}
