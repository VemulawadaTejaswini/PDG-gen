import java.util.*;

public class Main{
	
	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		
		// input
		int num = scan.nextInt();
		int[] edges = new int[100000];
		for(int i = 0; i < num; i++){
			edges[i] = scan.nextInt();
		}
		
		// search
		Arrays.sort(edges);
		int memory = edges[99999];
		int count = 1;
		int firstLen = 0;
		int secondLen = -1;
		for(int i = 99998; i >= 0; i--){
			if(memory == edges[i]){
				count++;
				if(count == 2){
					if(edges[i] > firstLen){
						secondLen = firstLen;
						firstLen = edges[i];
						count = 0;
					} else if(edges[i] > secondLen){
						secondLen = edges[i];
						count = 0;
					}
				}
			} else {
				memory = edges[i];
				count = 1;
			}
		}
		
		// output
		System.out.println(Math.max(firstLen * secondLen, 0));
		
	}
	
}