
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		//Scanner scan = new Scanner(System.in);
        String[] ana = new String[3];
        ana=line.split("");
        
		
        if(ana[0].equals(ana[2]))
        System.out.println("Yes");
        else
        System.out.println("No");
        
}
}