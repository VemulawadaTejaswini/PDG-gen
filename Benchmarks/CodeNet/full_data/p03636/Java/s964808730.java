import java.util.*;

public class Main{
  public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int length = str.length();
    int count = str.substring(1,length - 1).length();
    String result = str.substring(0,1) + String.valueOf(count) + str.substring(length - 1,length);
    System.out.println(result);
  }
}