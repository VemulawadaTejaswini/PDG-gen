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
		String S = sc.nextLine();

		char[] s = new char[S.length()];
		s = S.toCharArray();
		int count=0;
		int max=0;
		for(int i=0; i<=S.length()-1; i++){
			for(int j=S.length()-1; j>=0; j-- ){
				if(i>j){
					continue;
				}
				count = 0;
				for(int k=i; k<=j; k++){
					if(s[k]=='A' 
					|| s[k]=='T'
					|| s[k]=='C'
					|| s[k]=='G'){
						count ++;
					}else{
						break;
					}
				}
				if(max<count){
					max = count;
				}
			}
		}
		System.out.print(max);
	}	
}
