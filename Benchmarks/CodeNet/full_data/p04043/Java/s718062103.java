import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] n = line.split(" ");
		Boolean x = true;
		int num5=0;
		int num7=0;
		for(int i=0; i < 3; i++) {
		    if(n[i]=="5"){
		        num5++;
		    }
		    if(n[i]=="7"){
		        num7++;
		    }
		}
		if(num5==2&&num7==1){
		    System.out.println("YES");
		} else {
		    System.out.println("NO");
		}
		
	}
}