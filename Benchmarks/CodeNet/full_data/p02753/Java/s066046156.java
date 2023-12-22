import java.util.Scanner;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String station = sc.nextLine();
    String station1 = station.substring(0,1);
    String station2 = station.substring(1,2);
    String station3 = station.substring(2, 3);

    if(station1.equals(station2) && station2.equals(station3)) {
    	System.out.println("No");
    } else {
    	System.out.println("Yes");
    }

  }
}