import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = Integer.parseInt(sc.next());
	
		int []a = new int [n];
		int []b = new int [n];
	
		data []d = new data[n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Integer.parseInt(sc.next());
		}
		
		for(int i = 0 ;i < n ;i++) {
			d[i] = new data(a[i] , b[i]);
		}
		
		Arrays.sort(d, new Comparator<data>(){
			public int compare(data d1 ,data d2) {
				int temp = d1.getA() - d1.getA();
				if(temp == 0) {
					return d1.getB() -d2.getB();
				}
				return temp;
			}
		});
		
		long sum = 0;
		boolean flag = true;
		
		for(int i = 0 ; i < n ;i++) {
			sum += d[i].getA();
			if(sum > d[i].getB()) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	
	
	
	}   
}
class data{
	private int a;
	private int b;
	
	 public data(int a ,int b){
		this.a = a;
		this.b = b;	
	}
	 public int getA() {
		 return a;
	 }
	 public int getB() {
		 return b;
	 }
}


