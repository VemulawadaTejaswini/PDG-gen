import java.util.*;
public class Main{
	static int StrToNum(String s){
		switch(s){
			case "a":
				return 1;
			case "b":
				return 2;
			case "c":
				return 3;
			case "d":
				return 4;
			case "e":
				return 5;
			case "f":
				return 6;
			case "g":
				return 7;
			case "h":
				return 8;
			case "i":
				return 9;
			case "j":
				return 10;
			case "k":
				return 11;
			case "l":
				return 12;
			case "m":
				return 13;
			case "n":
				return 14;
			case "o":
				return 15;
			case "p":
				return 16;
			case "q":
				return 17;
			case "r":
				return 18;
			case "s":
				return 19;
			case "t":
				return 20;
			case "u":
				return 21;
			case "v":
				return 22;
			case "w":
				return 23;
			case "x":
				return 24;
			case "y":
				return 25;
			case "z":
				return 26;
		}
		return 0;
	}
	
	static int ListCompare(int[] l1, int[] l2){
		for(int i=0; i<l1.length; i++){
			if(i >= l2.length){
				return 1;
			}
			if(l1[i] > l2[i]){
				return 1;
			}else if(l1[i] < l2[i]){
				return -1;
			}
		}
		if(l2.length > l1.length){
			return -1;
		}else{
			return 0;
		}
	}
	
	static void quick_sort(int[][] d, int left, int right) {
		if(left>=right){
				return;
		}
		int[] p = d[(left+right)/2];
		int l = left, r = right;
		int[] tmp = new int[p.length];
		while(l<=r){
			while(ListCompare(d[l], p) > 0){ l++; }
			while(ListCompare(d[r], p) < 0){ r--; }
			if (l<=r) {
				tmp = d[l]; d[l] = d[r]; d[r] = tmp;
				l++;
				r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
	
	public static void main(String[] args){
		long ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] sp = new int[n][26];
		for(int i=0; i<n; i++){
			for(int l=0; l<26; l++){
				sp[i][l] = 0;
			}
			String s = sc.next();
			String[] ssp = s.split("");
			for(int j=0; j<ssp.length; j++){
				sp[i][StrToNum(ssp[j])-1]++;
			}
		}
		
		quick_sort(sp, 0, n-1);
		
		int j = 0;
		while(j < n-1){
			int rep = 1;
			int k = j+1;
			while(ListCompare(sp[k], sp[j]) == 0){
				ans += rep;
				rep++;
				k++;
				if(k >= sp.length){
					break;
				}
			}
			j = k;
		}
		
		System.out.println(ans);
	}
}
