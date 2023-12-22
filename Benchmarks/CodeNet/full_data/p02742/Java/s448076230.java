import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = A*B;
    System.out.println(C%2 == 0 ? C/2 : C/2+1);
  }
}