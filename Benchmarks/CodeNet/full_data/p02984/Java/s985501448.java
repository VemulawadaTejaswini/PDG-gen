import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		String[] strings = readLine();
		int N = Integer.parseInt(strings[0]);
		int[] A = new int[N];
		strings = readLine();
		for(int i=0;i<N;i++) {
			A[i]= Integer.parseInt(strings[i]);
		}
		int[] x = new int[N];
		x[0]=A[0];
		for(int i=1;i<N-1;i+=2) {
			x[0]+=(-A[i]+A[i+1]);
		}
		x[0]/=2;
		for(int i=1;i<N;i++) {
			x[i]=A[i-1]-x[i-1];
		}
		StringBuilder sBuilder = new StringBuilder();
		for(int i=0;i<N-1;i++) {
			sBuilder.append(x[i]*2).append(" ");
		}
		sBuilder.append(x[N-1]*2);
		print(sBuilder.toString());
		
		//String[] s = readLine();
		//print(num);
	}
	
	//functions here
	//note that all methods should be STATIC

	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
}
