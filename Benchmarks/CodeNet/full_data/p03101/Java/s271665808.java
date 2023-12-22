import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
      	int col = sc.nextInt();
      	int paintRow = sc.nextInt();
      	int paintCol = sc.nextInt();
      
      	System.out.println((row * col) - (paintRow * col)
        	- ((row - paintRow) * paintCol));
    }
}