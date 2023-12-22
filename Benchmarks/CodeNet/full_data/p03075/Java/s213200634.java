
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for(int i=0; i<5; i++){
			a[i] = Integer.parseInt(sc.next());
		}
		int k = Integer.parseInt(sc.next());
		
		if(a[4]-a[0]>k){
			System.out.println(":(");
		}else{
			System.out.println("Yay!");
		}
		
		sc.close();
	}
	
}
