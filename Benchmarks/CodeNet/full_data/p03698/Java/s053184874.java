import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		String input = br.readLine();
		Main mn = new Main();
		if(mn.isUnique(input)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
	}
	public boolean isUnique(String s){
		boolean[] alphabet = new boolean[26];
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');

		for(int i=0; i<26;i++){
			alphabet[i] = false;
		}

		for(int i=0; i<s.length();i++){
			char c = s.charAt(i);
			int idx = Character.getNumericValue(c);
			if(a <= idx && z >= idx){
					if(alphabet[idx-a]){
						return false;
					}else{
					alphabet[idx-a] = true;
					}
			}else{
					return false;
			}			
		}
		return true;
	}
}