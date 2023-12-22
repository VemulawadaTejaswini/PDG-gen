import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static void main(String[] args)throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] test = new int[3];
		
		for(int i=0; i<3; i++){
		String str = br.readLine();
		test[i] = Integer.parseInt(str);
	
		}
		if(test[0]+test[1]==test[2] || test[1]+test[2]==test[0] || test[0]+test[2]==test[1]){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
	}

}
