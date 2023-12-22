import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = Integer.parseInt(sc.next()); //N
		int number[]= new int [n];
		int sub[] =new int [n];
		int a=0;
		for(int i=0;i<n;i++) {
			number[i]= Integer.parseInt(sc.next()); 
			sub[i]=number[i];
		}
		sc.close();
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
				number[i]=sub[i];
			}
			number[k]=0;
			Arrays.sort(number);
			System.out.println(number[n/2]);
		}
	}
}
