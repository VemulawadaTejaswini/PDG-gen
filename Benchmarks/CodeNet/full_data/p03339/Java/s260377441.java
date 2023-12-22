import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	public static void main(String args[]){
		try {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			InputStreamReader isr = new InputStreamReader(System.in);
			ArrayList<Character> direction = new ArrayList<>();
			
			for(int i = 0; i < n; i++) {
				direction.add((char)isr.read());
			}
			
			TreeSet<Integer> change = new TreeSet<>();
			for(int i = 0; i < n; i++) {
				int count = 0;
				
				
				for(int a = 0; a < n; a++) {
					Character member = direction.get(a);
					
					if(a == i) {
						continue;
					}else if(a < i) {
						if(member.equals('W')) {
							count++;
						}
					}else if(a > i) {
						if(member.equals('E')) {
							count++;
						}
					}
					
				}
				
				change.add(count);
				
			}
			
			System.out.println(change.first());
			
			
		}catch(IOException e) {
			
			System.out.println("入力エラー");
			
		}
		
		
	}
}