package main;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main{

	public static void main(String[] args){
		solve();
		}

	public static void solve(){
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());

		boolean[] isFrom1 = new boolean[N];
		boolean[] isFromN = new boolean[N];

		for(int i = 0;i<M;i++){
			int ai = Integer.parseInt(sc.next());
			int bi = Integer.parseInt(sc.next());
			if(ai==1){
				isFrom1[bi]=true;
			}
			if(bi==N){
				isFromN[ai]=true;
			}
		}
		boolean routeExists =false;for(int i=0;i<N;i++)routeExists=routeExists||(isFrom1[i]&&isFromN[i]);
		answer(routeExists);
		sc.close();

	}

	public static void answer(boolean b){
		String yes =new String("POSSIBLE");
		String no =new String("IMPOSSIBLE");
		System.out.println(b?yes:no);
	}



}
