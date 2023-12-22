import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String n = sc.nextLine();
      int a = n.indexOf("A");
      int z = n.lastIndexOf("Z");
      System.out.println(z-a+1);
	}
}