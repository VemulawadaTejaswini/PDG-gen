import java.util.Scanner;
import java.util.Arrays;


public class a{
	public static void main(String [] args){
		int sum=0,k,pos;
		int array[] = new int[100];
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			array[i] = sc.nextInt();
			sum += array[i];
		}
		pos = n-1;
		for(int i=0;i<n;i++){
			for(int j=0;j<pos;j++){
				if(array[j] > array[j + 1]){
					k = array[j];
					array[j] = array[j+1];
					array[j+1] = k;
				}
			}
			pos--;
		}
		
		for(int i=0;i<n && (sum % 10) == 0;i++)
			sum -= array[i];

		System.out.println(sum);
	}

}