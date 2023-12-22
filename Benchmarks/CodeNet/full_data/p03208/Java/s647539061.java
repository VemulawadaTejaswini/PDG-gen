import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		List<Integer> tree = new ArrayList<>();
		
		// input
		final int NUM = scan.nextInt();
		int light = scan.nextInt();
		for(int i = 0; i < NUM; i++){
			tree.add(scan.nextInt()) ;
		}
		
		// sort
		Collections.sort(tree);
		
		// search
		long answer = Long.MAX_VALUE;
		for(int i = 0; i <= NUM - light; i++){
			if(tree.get(i+light-1) - tree.get(i) < answer){
				answer = tree.get(i+light-1) - tree.get(i);
			}
		}
		
		System.out.println(answer);
	}
}