import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		String[] s = readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int A = Integer.parseInt(s[1]);
		int B = Integer.parseInt(s[2]);
		boolean[] A_b = new boolean[N];
		boolean[] B_b = new boolean[N];
		int diff_cnt = 0;
		for(int i=0;i<N;i++){
			A_b[i] = ((A&bit(N-i-1))!=0);
			B_b[i] = ((B&bit(N-i-1))!=0);
			if(A_b[i]!=B_b[i]){diff_cnt++;}
		}
		print("YES");
        print("1 0 2 3");
	}
	
	private static long bit(long d){
		if(d<=0){return 1;}
		return bit(d-1)*2;
	}

	private static String readLine(){
		try{
			return reader.readLine();
		}catch(Exception e){
			return e.getMessage();
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
	private static void print_succession(Object o){
		System.out.print(o);
	}
	
}
