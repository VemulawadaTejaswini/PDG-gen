import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanenr = new Scanner(System.in);
    	int k = 0;
    	int a = scanenr.nextInt();
    	int b = scanenr.nextInt();
    	int c = scanenr.nextInt();
    	int d = scanenr.nextInt();
    	int e = scanenr.nextInt();
    	k = e - a ;
   	if (k <= 15) {
      System.out.print("Yay!");
    }
    else {
      System.out.print(":(");
    }
  }
}