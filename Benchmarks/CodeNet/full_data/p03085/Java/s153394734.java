import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        switch(s){
          case "A":
            System.out.println("T");
          case "T":
            System.out.println("A");
          case "G":
            System.out.println("C");
          case "C":
            System.out.println("G");
          default :
        }
	}
}