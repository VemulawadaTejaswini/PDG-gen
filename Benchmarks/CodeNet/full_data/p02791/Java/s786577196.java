import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean gg=true;
		Integer[] array = new Integer[n];
		int a = 1;
		int b = 0;
		for(int i = 0;i<n;i++) {
			array[i] = s.nextInt();
			if(i!= 0) {
				if(array[i]< b) {
					b=array[i];
					a++;
				}else {
					
				}
				
			}else {
				b = array[i];
			}
		}
		System.out.print(a);
		
		
	}
}