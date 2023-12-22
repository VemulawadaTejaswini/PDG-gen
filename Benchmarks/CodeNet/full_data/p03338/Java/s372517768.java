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
		String S = sc.next();
		int count;
		int max = 0;
		for(int i=0; i<N-1; i++){
			ArrayList<Character> list = new ArrayList<Character>();
			count = 0;
			for(int j=0; j<=i; j++){
				for(int k=i+1; k<N; k++){
					if(S.charAt(j)==S.charAt(k)){
						if(list.contains(S.charAt(j))){
							break;
						}else{
							list.add(S.charAt(j));
							count ++;
						}
					}
				}
			}
			max = Math.max(max,count);
		}
		System.out.println(max);
	}
}
