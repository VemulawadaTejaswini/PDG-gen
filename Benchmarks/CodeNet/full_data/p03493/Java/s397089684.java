import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		//input case
		//	N is not match number of input info
		
		int num_of_operation = 0;
		int Array[];
		Array = new int[N];
		
		for(int i = 0;i<N;i++) {
			Array[i]=scan.nextInt();
		}
		
		label:for(;;) {
			for(int j =0;j<Array.length;j++) {
				if(Array[j]%2!=0) {
					break label;
				}
				Array[j] = Array[j] /2;
				
			}
			num_of_operation++;
		}
		
		System.out.println(num_of_operation);
		scan.close();
	}
}
