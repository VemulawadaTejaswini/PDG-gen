import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int X = sc.nextInt();
		String result = "NO";
 
      	if(X == 7 || X == 5 || X == 3){
        	result = "YES";
        }
 
		System.out.println(result);
	}
}