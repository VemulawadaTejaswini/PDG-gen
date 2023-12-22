import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[] counter = new int[26];
		String[] a = new String[h];
		for(int i=0;i<h;i++){
			a[i] = sc.next();
			for(int j=0;j<w;j++){
				counter[(int)a[i].charAt(j)-(int)'a']++;
			}
		}
		int one = 0;
		int two = 0;
		if(h%2==1 && w%2==1){
			one = 1;
			two = (h + w - 2)/2;
		}
		else if(h%2==1){
			two = w;
		}
		else if(w%2==1){
			two = h;
		}
		
		int four = h*w-2*two-one;
		//System.out.println(four+" "+two+" "+one);
		for(int i=0;i<26;i++){
			if(counter[i]>=4){
				counter[i] -= 4;
				i--;
				four-=4;
			}
			if(four==0){
				break;
			}
		}
		for(int i=0;i<26;i++){
			if(counter[i]>=2){
				counter[i] -= 2;
				i--;
				two-=2;
			}
			if(two==0){
				break;
			}
		}
		for(int i=0;i<26;i++){
			if(counter[i]>=1){
				counter[i] -= 1;
				i--;
				one--;
			}
			if(one==0){
				break;
			}
		}
		if(four==0 && two==0 && one==0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}

