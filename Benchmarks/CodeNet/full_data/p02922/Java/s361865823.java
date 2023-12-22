import java.util.*;
public class Main {
	public static void main(String args[]) {
     	Scanner scan = new Scanner(System.in);
      	int a = scan.nextInt();
      	int b = scan.nextInt();
      	if(a%b==0) {
          a=a/b;
        }else{
          a=a/b+1;
        }
      System.out.println(a);
    }
}