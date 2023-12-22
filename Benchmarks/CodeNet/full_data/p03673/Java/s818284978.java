import java.util.*;
public class Main {
	static Deque<Integer> stack = new LinkedList<Integer>();
	public static void main(String[]args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int [] a = new int [n];
		for(int i=0;i<n;i++){
			a[i] = stdIn.nextInt();
		}
		int c =1;
		for(int i=0;i<n;i++){
			stack.push(a[i]);
			int [] r = new int [c];
			for(int j=0;j<c;j++){
				r[j] = stack.pop();
			}
			for(int j=0;j<c;j++){
					stack.push(r[j]);
			}
			c++;
		}
		int [] b = new int [n];
		for(int i=0;i<n;i++){
			b[i] = stack.pop();
		}
		for(int i=n-1;i>=0;i--){
			System.out.print(b[i]+" ");
		}
	}

}
