import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < N; i++) map.put(i+1, in.nextInt());
		
		int button = 1;
		int count = 0;
		for(int i = 0; i < N; i++){
			button = map.get(button);
			count++;
			if(button == 2){
				System.out.println(count);
				return;
			}
		}
		
		System.out.println(-1);
	}
}
