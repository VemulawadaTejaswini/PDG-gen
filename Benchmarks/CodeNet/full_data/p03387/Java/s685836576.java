import java.util.*;
import java.io.*;

public class Main {
		public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		String[] in1 = br.readLine().split(" ");
		int[] in2 = new int[in1.length];
		for(int i=0; i<in1.length; i++){
		in2[i] = Integer.parseInt(in1[i]);
		}
		Arrays.sort(in2);
		
		// BとCをなるべくAに近づける
		int ans = (in2[2]-in2[1])/2+(in2[2]-in2[0])/2;
		// Aとの差を確認する
		int ab = (in2[2]-in2[1])%2;
		int ac = (in2[2]-in2[0])%2;
		
		if(ab == 0){
		    if(ac == 0){
		    //ABCの差が無いので追加操作不要
		    }else{
		        //差が(0,0,-1)のため、AとBに+1、Cに+2で操作は2回
		        ans += 2;
		    }
		
		}else{
		    if(ac == 0){
		    //差が(0,-1,0)のため、AとCに+1、Bに+2で操作は2回
		        ans += 2;
		    }else{
		        //差が(0,-1,-1)のため、BとCに+1で操作は1回
		        ans += 1;
		    }
		}
		
		System.out.println(ans);
	}
}