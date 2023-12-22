import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 int n = std.nextInt();
		 int[] v = new int[n];
		 int[] c = new int[n];
 		 for (int i=0;i<n;i++) {
			 v[i] = std.nextInt();
		 }
		 for( int i=0;i<n;i++) {
			 c[i] = std.nextInt();
		 }
		 int count =0;
		 for( int i=0;i<n;i++) {
			 if(v[i]>c[i]) {
				 count += v[i]-c[i];
			 }
		 }
		 System.out.println(count);
	 }
}
