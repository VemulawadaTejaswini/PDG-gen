import java.util.Scanner;
public class Main {
	public static void main(String args[]){
      try (Scanner sc = new Scanner(System.in)) {
        while (sc.hasNextInt()) {
               int a = sc.nextInt();
               int b = sc.nextInt();
               if (a%2==0){
               	if (b%2==0){
               		System.out.println("Even");
               	} else {
               		System.out.println("Odd");
               	}
               } else {
               	System.out.println("Odd");
               }
            }
        }
    }
}