import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    String M = s.next();
    if (N >= 3200){
      System.out.println(M);
    }
    else{
      System.out.println("red");
    }
    
  }
}