
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static final int INF=Integer.MAX_VALUE;
	static final long LINF=Long.MAX_VALUE;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		String output = input.substring(0, 4) + " " + input.substring(4, input.length()); 
		
		p(output);
		
		
		
	}
	
	
	
	
	public static void p(Number a) {
		System.out.println(a);		
	}
	public static void p(String a) {
		System.out.println(a);		
	}
	public static void pn(Number a) {
		System.out.print(a);		
	}
	public static void pn(String a) {
		System.out.print(a);		
	}
	
	public static int powerInt(int a, int b) {
		return (int) Math.pow(a, b);
	}

	public static int max(int arr[]) {
		int max = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	public static double max(double arr[]) {
		double max = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}	
	public static int min(int arr[]) {
		int max = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (max > arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	public static double min(double arr[]) {
		double max = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (max > arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}	

}




class CompUpInt implements Comparator {
	public int compare(Object o1,Object o2){
		int n1 = (int)o1;
		int n2 = (int)o2;
		return n1 - n2;
	}
}
class CompUpDbl implements Comparator {
	public int compare(Object o1,Object o2){
		double n1 = (double)o1;
		double n2 = (double)o2;
		return (n1 > n2) ? 1 : -1;
	}
}
class CompUpIntD2 implements Comparator {
	public int compare(Object o1,Object o2){
		int n1[] = (int[])o1;
		int n2[] = (int[])o2;
		return n1[1] - n2[1];
	}
}
