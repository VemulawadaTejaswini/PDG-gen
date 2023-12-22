import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt(),  b[] = new int[n];
		List<Integer> a=new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
			b[i] = -1;
		}
		for (int i = 0; i < n; i++) {
			if(i%2==0) {
				b[i/2]=a.get(a.size()-1);
				a.remove(a.size()-1);
			}else {
				b[n-1-i/2]=a.get(a.size()-1);
				a.remove(a.size()-1);
			}
		}
		for(int i=0;i<n-1;i++) System.out.print(b[i]+" ");
		System.out.println(b[n-1]);
	}
}