import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 int r = std.nextInt();
		 int d = std.nextInt();
		 int x = std.nextInt();
		 for(int i=0;i<10;i++) {
			 x = r*x-d;
			 System.out.println(x);
		 }
	 }

}
