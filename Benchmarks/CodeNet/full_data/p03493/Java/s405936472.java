import java.util.Scanner;

//  ABC 081 A - Placing Marbles

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    int index = 0;
	int count = 0;

   while(true) {
	   index = a.indexOf("1", index) + 1;
	   if(index == 0) break;
	   count++;
   }
   System.out.println(count);
  }
}