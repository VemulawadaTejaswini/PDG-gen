import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String getLine = sc.nextLine();
    String[] array = getLine.split(" ");
    
    System.out.println(array[0].substring(0,1)+array[1].substring(0,1)+array[2].substring(0,1));
  }
}