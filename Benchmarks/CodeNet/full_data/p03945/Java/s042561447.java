import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    char[] c = line.toCharArray();
    int count = 0;
    for(int i = 0; i < c.length-1; i++) {
      if(c[i] != c[i+1]){
        count++;
      }
    }
    System.out.println(count);
  }
}