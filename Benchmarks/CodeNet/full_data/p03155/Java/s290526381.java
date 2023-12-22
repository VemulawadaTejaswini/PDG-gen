import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
     	int height = scanner.nextInt();
      	int width = scanner.nextInt();
      	int result = (length - height + 1)  * (length - width + 1);
      	System.out.print(result);
    }
}