
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n  = Integer.parseInt(sc.next());
		
		Data []d = new Data [n];
		Data []L = new Data[n];
		
		for(int i = 0 ; i < n ; i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			d[i] = new Data(a,b);
		}
		SortingB(d);
		 
		for(int i = 0 ; i < n ;i++) {
			 int l = d[i].getA() - d[i].getB();
			 int r = d[i].getA() + d[i].getB();
			 L[i] = new Data(l,r);
		}
		
		 SortingA(L);
		 int right = L[0].getB();
		 int ans = 1;
		 
		 for(int i = 1 ; i < n ;i++) {
			 if(right <= L[i].getA()) {
				 ans++;
				 right = L[i].getB();
			 }
		 }
		 
		 System.out.println(ans);
	}
	static void SortingA(Data[] d) {
		 Arrays.sort(d, new Comparator<Data>(){
	        	public int compare(Data d1, Data d2) {
	        		return d1.getA() - d2.getA();
	        	}
	        });
	}
	
	static void SortingB(Data[] d)  {
		 Arrays.sort(d, new Comparator<Data>(){
	        	public int compare(Data d1, Data d2) {
	        		return d1.getB() -d2.getB();
	        	}
	        });
	}

}

class Data{
	private int A;
	private int B;
	
	public Data(int A , int B) {
		this.A = A;
		this.B = B;
	}
	
	public int getA() {
		return A;
	}
	public int getB() {
		return B;
	}
}
