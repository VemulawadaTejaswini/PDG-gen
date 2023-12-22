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
		int Q = sc.nextInt();
		String S = sc.next();

		char[] s = new char[S.length()];
		s = S.toCharArray();

		int[] l = new int[Q];
		int[] r = new int[Q];

		for(int i=0; i<Q; i++){
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		int count = 0;

		for(int i=0; i<Q; i++){
			for(int h=l[i]-1; h<r[i]-1; h++){
				if(s[h]=='A' && s[h+1]=='C'){
					count ++;
				}
			}
			System.out.println(count);
			count = 0;
		}
	}	
}
