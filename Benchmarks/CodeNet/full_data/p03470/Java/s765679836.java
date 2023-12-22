import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int y = scan.nextInt();
    boolean flag = false;

    outside:for(int i = 0; i <= n; i++){
      for(int j = 0; j <=n-i; j++){
        if(10000*i + 5000*j + 1000*(n-i-j) == y){
          System.out.println(i + " " + j + " " + (n-i-j));
          flag = true;
          break outside;
        }
      }
    }
    if(flag == false){System.out.println((-1) + " " + (-1) + " " + (-1));}
  }
}
