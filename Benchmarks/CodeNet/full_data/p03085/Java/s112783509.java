import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	String ch = sc.next();
      	switch(ch) {
          case "A":
            System.out.println("T");
            break;
          case "T":
            System.out.println("A");
            break;
          case "G":
            System.out.println("C");
            break;
          case "C":
            System.out.println("G");
            break;
        }
    }
}