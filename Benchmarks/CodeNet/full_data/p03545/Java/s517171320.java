import java.util.*;
import java.io.*;

public class Main {
		public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		String[] in = br.readLine().split("");
		
		int A = Integer.parseInt(in[0]);
		int B = Integer.parseInt(in[1]);
		int C = Integer.parseInt(in[2]);
		int D = Integer.parseInt(in[3]);
		
		String ans = "";
		
		//プラスなら0、マイナスなら1
		// 3個の箱があってそこに0と1を入れたい
		// 000から111までのすべてを試す時
		// 1<<3によって最大値111+1=1000を表せる
		int conN = 1 << 3;
		//0b0は、bitで表した0のことで、例えば0b10なら数字の2を表せる。
		for(int c=0b0; c<conN; c++) {
			
			int sum = A;
			String op1 = "+";
			String op2 = "+";
			String op3 = "+";
			
			//決めた組み合わせで数列を足し引きしたときに、合計が7であるかを確認する
			if(((c>>0)&1) == 1) {
			    sum -=B;
			    op1 = "-";
			}else{
			    sum +=B;
			}
			
			if(((c>>1)&1)== 1) {
			    sum -=C;
			    op2 = "-";
			}else{
			    sum +=C;
			}
			
			if(((c>>2)&1) == 1) {
			    sum -=D;
			    op3 = "-";
			}else{
			    sum +=D;
			}
			
			if(sum == 7){
			   ans = A+op1+B+op2+C+op3+D+"=7";
			   break;
			}
		}
		
		System.out.println(ans);
	}
}

    
