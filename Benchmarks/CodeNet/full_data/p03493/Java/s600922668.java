import java.util.*;

public class Main {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int result = 0;
    for (char tmp : str.split("")) {
    	result = Character.getNumValue(tmp);
    }
    System.out.println(result);
   	}
  }
}   
