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
		
		int[] r = StackToArray(stackR);
		int[] g = StackToArray(stackG);
		int[] b = StackToArray(stackB);
		
		long ans = 0;
		
		for(int i : r) {
			for(int j : g) {
				for(int k : b) {
					int first = Math.min(i,Math.min(j,k));
					int third = Math.max(i,Math.max(j,k));
					int second = (i+j+k)-first-third;
					
					if(second-first != third-second) ans++;
				}
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
			array[i] = stack.remove();
		}
		
		return array;
	}
}
