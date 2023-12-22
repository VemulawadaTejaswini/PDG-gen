import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String line=in.readLine();
		
		int[]world=new int[26];
		
		for (int i = 0; i < line.length(); i++) {
			char c=line.charAt(i);
			world[c-'a']++;
		}
		
		for (int i = 0; i < world.length; i++) {
			if(world[i]%2!=0){
				System.out.println("No");
				return;
			}
				
		}
		System.out.println("Yes");
	}
}
