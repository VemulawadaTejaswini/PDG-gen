import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long n = sc.nextInt();

      long i = 1;
      while(i * i < n) {
          i++;
      }

      System.out.println(i * i);
  }
}

