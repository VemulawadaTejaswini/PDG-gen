import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt();
		int W = in.nextInt();
		int N = in.nextInt();
		String[] lines = new String[H];
		int indexH = 0;
		int indexW = 0;
		
		for(int i = 0; i < N; i++){
			int a = in.nextInt();
			int c = i + 1;
			for(int j = 0; j < a; j++){
				if(lines[indexH] == null) lines[indexH] = "";
				lines[indexH] += c;
				indexW++;
				if(indexW == W){
					indexH++;
					indexW = 0;
				}else lines[indexH] += " ";
			}
		}
		
		for(int i = 0; i < H; i++){
			if(i % 2 == 0) System.out.println(lines[i]);
			else System.out.println(new StringBuilder(lines[i]).reverse());
		}
	}
}
