import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    
    StringBuilder sb = new StringBuilder(sc.next());
    int price = 700;
    for(int i = 0; i < sb.length(); i++){
      price += (sb.charAt(i) == 'o' ? 100 : 0);
    }
    System.out.println(price);
  }
}
