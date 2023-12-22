import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		char[] rgb = scan.next().toCharArray();
		scan.close();
		
		LinkedList<Integer> stackR = new LinkedList<>();
		AddToStack(stackR,rgb,'R');
		LinkedList<Integer> stackG = new LinkedList<>();
		AddToStack(stackG,rgb,'G');
		LinkedList<Integer> stackB = new LinkedList<>();
		AddToStack(stackB,rgb,'B');
		
		long ans = 0;
		
		for(int i : stackR) {
			for(int j : stackG) {
				ans += stackB.size();;
				int max = Math.max(i,j);
				int min = Math.min(i,j);
				int diff = max-min;
				if(stackB.contains(max+diff)) ans--;
				if(stackB.contains(min-diff)) ans--;
				if(diff%2 == 0 && stackB.contains(min+diff/2)) ans--;
			}
		}
		
		System.out.println(ans);
	}

	public static void AddToStack(LinkedList<Integer> stack, char[] rgb, char c) {
		for(int i = 0; i < rgb.length; i++) {
			if(rgb[i] == c) stack.addFirst(i);
		}
	}
	
	public static int[] StackToArray(LinkedList<Integer> stack) {
		int[] array = new int[stack.size()];
		for(int i = 0; i < array.length; i++) {
			array[i] = stack.removeLast();
		}
		
		return array;
	}
}
