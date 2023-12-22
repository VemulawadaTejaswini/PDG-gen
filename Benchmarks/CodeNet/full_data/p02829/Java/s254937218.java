import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		String[] strings = readLine();
		int A = Integer.parseInt(strings[0]);
		strings = readLine();
		int B = Integer.parseInt(strings[0]);
		boolean[] abc = new boolean[] {true,true,true};
		abc[A-1] = false;
		abc[B-1] = false;
		if(abc[0]) {print("1");}
		if(abc[1]) {print("2");}
		if(abc[2]) {print("3");}
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
