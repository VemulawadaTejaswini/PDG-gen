import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

			int n = Integer.parseInt(bf.readLine().trim());

			String[] input;
			Record[] r = new Record[n];
			
			for(int i=0; i<n;i++){
				input = bf.readLine().split(" ");
				r[i] = new Record(input[0], Integer.parseInt(input[1]));
			}
			
			int s[] = new int[n];
			for(int i=0; i<n;i++){
				s[i]=0;
				for(int j=0; j<n;j++){
					if (i==j) continue;
					if( r[i].compareTo(r[j])>0) s[i]++;
				}
			}
			
			for(int i=0;i<n;i++){
				System.out.println(s[i]+1);	
			}
			

		}catch(Exception e){
			e.printStackTrace();
		}

	}
	
	static public class Record {
		
		Record(String a, int b){
			city = a;
			num = b;
		}
		
		String city;
		int num;
		
		public int compareTo(Record x){
			if ( city.equals(x.city) != true ){
				return city.compareTo(x.city); 
			}else{
				return x.num - num;
			}
		}
		
	}
}