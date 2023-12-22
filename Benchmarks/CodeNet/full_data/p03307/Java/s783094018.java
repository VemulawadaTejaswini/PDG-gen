import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();
    System.out.println((int)((n % 2) == 0 ? n : n * 2 ));
    return;
  }
}
