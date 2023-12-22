import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];	
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		
		ArrayList<Integer> color = new ArrayList<>();
		//int max = a[0];
		for(int i = 0; i < n; i++) {
			int max = -1;
			for(int c : color) {
				if(c < a[i] && max < c)max = c;
			}
			
			if(max == -1) {
				color.add(a[i]);
			} else {
				color.set(color.indexOf(max), a[i]);
			}
			//System.out.println("max="+ max);
			//System.out.println(color.toString());
			
		}
		
		System.out.println(color.size());
		
	}

}
