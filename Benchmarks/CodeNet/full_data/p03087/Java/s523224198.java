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
import java.lang.Integer;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();

		char[] s = new char[S.length()];
		//s = S.toCharArray();

		int[] l = new int[Q];
		int[] r = new int[Q];

		for(int i=0; i<Q; i++){
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		//int count = 0;
		//ArrayList<Integer> ls = new ArrayList<Integer>();
		String str1;
		for(int i=0; i<Q; i++){
			
			if(r[i] != S.length()){
				str1 = S.substring(l[i]-1,r[i]);
			}else{
				str1 = S.substring(l[i]-1,r[i]-1);
			}
			String[] str2 = str1.split("AC",-1);
			System.out.println(str2.length-1);
		}


/*
		while(true){
			int result = S.indexOf("AC");
			if(result==-1){
				break;
			}else{
				ls.add(result+1);
				S = S.substring(result+2,S.length()-1);
			}
		}
*/
		/*
		for(int i=0; i<S.length()-1; i++){
			if(s[i]=='A' && s[i+1]=='C'){
				ls.add(i+1);
			}
		}*/

		//for(int i=0; i<ls.size(); i++)System.out.println(ls.get(i));
/*
		for(int i=0; i<Q; i++){
			count = 0;
			for(int j=0; j<ls.size(); j++){
				int lsint = ls.get(j);
				if(lsint>=l[i]){
					count++;
					if(lsint>=r[i]){
						count--;
						break;
					}
				}
			}
			System.out.println(count);
		}
*/
/*
		for(int i=0; i<Q; i++){
			for(int h=l[i]-1; h<r[i]-1; h++){
				if(s[h]=='A' && s[h+1]=='C'){
					count ++;
				}
			}
			System.out.println(count);
			count = 0;
		}
*/
	}	
}
