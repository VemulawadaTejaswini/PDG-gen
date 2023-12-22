import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args){
        new Main().solve();
    }
   void solve() {
	   Scanner sc=new Scanner(System.in);
	   
		int H=sc.nextInt();
		int W=sc.nextInt();
		char[][]a=new char[H][W];
		String ans="Yes";
		for(int i=0;i<H;i++) {
			String s=sc.next();
			a[i]=s.toCharArray();
		}
		int[]alph=new int[26];
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				alph[a[i][j]-'a']++;
			}
		}
		if(H%2==0 && W%2==0) {
			for(int i=0;i<26;i++) {
				if(alph[i]%4!=0) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
			return;
		}else if(H%2!=0 && W%2!=0) {
			int count=0;
			int count4=0;
			for(int i=0;i<26;i++) {
				if(alph[i]%2!=0) {
					count++;
					alph[i]-=1;
				}
			}
			for(int i=0;i<26;i++) {
				if(alph[i]>4) {
					count4++;
				}
			}
			if(H>=3 && W>3) {
			if(count==1 && count4>0) {
				System.out.println("Yes");
				return;
			}else {
				System.out.println("No");
				return;
			}
			}else {
				if(count==1) {
					System.out.println("Yes");
					return;
				}else {
					System.out.println("No");
					return;
				}
			}
		}else {
			int count=0;
			int count4=0;
			for(int i=0;i<26;i++) {
				if(alph[i]%2!=0) {
					count++;
				}else if(alph[i]>0 && alph[i]%4==0) {
					count4++;
				}
			}
			
			if(count==0) {
				if(H<3 && W<3) {
					System.out.println("Yes");
					return;
				}else if(count4>0) {
					System.out.println("Yes");
					return;
				}else {
					System.out.println("No");
					return;
				}
			}else {
				System.out.println("No");
				return;
			}
		}
   }
}
