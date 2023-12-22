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
		long L = Long.parseLong(strings[0]);
		long R = Long.parseLong(strings[1]);
		if(R-L>=2019) {print(0);return;}
		L%=2019;
		R%=2019;
		if(R<L) {print(0);}
		else {
			int min = 2018;
			for(int i=(int)L;i<=R;i++) {
				for(int j=i+1;j<=R;j++) {
					if((i*j)%2019<min) {
						print(i+","+j+" "+((i*j)%2019));
						min=(i*j)%2019;
					}
				}
			}
			print(min);
		}
		
		
		
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