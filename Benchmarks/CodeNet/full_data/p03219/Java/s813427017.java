import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int X = scan.nextInt();
    int Y = scan.nextInt();

    if (Y % 2 == 0){
      System.out.println(X + Y/2);
    }

  }

}
