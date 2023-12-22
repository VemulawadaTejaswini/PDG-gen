import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int Q = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		//char[] c = sc.next().toCharArray();
		Scanner sc = new Scanner(System.in);
		
		
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next())-1;
		int B = Integer.parseInt(sc.next())-1;
		int C = Integer.parseInt(sc.next())-1;
		int D = Integer.parseInt(sc.next())-1;
		
		char[] S = sc.next().toCharArray();
		boolean ans = true;
		boolean b_non_kabe = false;
		if(C<D){
			for(int i=B+1; i<N-1;i++){
				if(i==D)break;
				if(S[i]=='#' && S[i+1] == '#'){
					ans = false;
					break;
				}
			}
			if(ans){
				for(int i=A+1; i<N-1;i++){
					if(i==C)break;
					if(S[i]=='#' && S[i+1] == '#'){
						ans = false;
						break;
					}
				}
			}
			
			if(ans){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{//AがBを追い越すとき
			for(int i=B+1; i<N-1;i++){
				if(i==D)break;
				if(S[i]=='#' && S[i+1] == '#'){
					ans = false;
					break;
				}
				if(S[i]=='.' && S[i-1]=='.' && S[i+1]=='.')b_non_kabe = true;
			}
			if(ans){
				for(int i=A+1; i<N-1;i++){
					if(i==C)break;
					if(S[i]=='#' && S[i+1] == '#'){
						ans = false;
						break;
					}
				}
			}
			
			if(ans && b_non_kabe){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}

	}
	

	
}

