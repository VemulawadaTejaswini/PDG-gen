import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		String[] Ns= new String[3];
		Ns = N.split(" ");
		
		int five  = 0;
		int seven = 0;
		
		if (Ns[0].equals("5") ){
			five++;
		}else if(Ns[0].equals("7")){
			seven++;
		}
		
		if (Ns[1].equals("5") ){
			five++;
		}else if(Ns[1].equals("7") && seven==0){
			seven++;
		}
		
		if (Ns[2].equals("5") && five < 2){
			five++;
		}else if(Ns[2].equals("7") && seven==0){
			seven++;
		}
		
		System.out.println(five);
		System.out.println(seven);
		
		if(five==2 && seven==1){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}	
}
