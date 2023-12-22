import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
      	Scanner sc = new Scanner(System.in);
		String S = sc.next();
      	String[] arr = S.split("");
      	if(arr[0]==arr[1]&&arr[0]==arr[2]){
        	System.out.println("No");
        }
      	else System.out.println("Yes");
    }
}