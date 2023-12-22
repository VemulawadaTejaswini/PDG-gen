import java.util.*;

public class Main {
	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int AB = sc.nextInt();
      int BC = sc.nextInt();
      int CA = sc.nextInt();
      int max = Math.max(Math.max(AB,CA),Math.max(CA,BC));
      int min = Math.min(Math.min(AB,CA),Math.min(CA,BC));
      int middle = AB + BC + CA -max - min;
      System.out.println(min * middle / 2); 
    }
}