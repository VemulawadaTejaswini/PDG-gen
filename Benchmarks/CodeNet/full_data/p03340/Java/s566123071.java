import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> num = new ArrayList<Integer>();
		for(int i=0; i<N; i++){
			num.add(sc.nextInt());
		}

		//int[] num = Num.toArray(new int[Num.size()]);

		int xor,sum;
		int xorNew,sumNew;
		int count = 0;
		for(int i=0; i<N; i++){
			xor = num.get(i);
			sum = num.get(i);
			count ++;
			for(int j=i+1; j<N; j++){
				sumNew = sum + num.get(j);
				xorNew = xor ^ num.get(j);
				if(sumNew == xorNew){
					count ++;
				}
				sum = sumNew;
				xor = xorNew;
			}

		}
		System.out.println(count);
	}
}
