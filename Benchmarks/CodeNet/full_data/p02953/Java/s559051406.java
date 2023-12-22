import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
		int[] h = new int[N];
		ArrayList<Integer> li = new ArrayList<>();
		int count = 0;
		for(int i=0; i<N; i++) {
			h[i]= sc.nextInt();
			li.add(h[i]);
		}
		Arrays.sort(h);

		for(int i=0; i<N; i++) {
			if(h[i]!=li.get(i)) {
				count++;
			}
		}
		if(count<3) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
    }
}