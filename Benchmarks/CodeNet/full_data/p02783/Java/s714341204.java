import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int a = sc.nextInt();
    int attacks = 0;
    while(h!=0 || h<0){
      h = h-a;
      attacks++;
    }
    System.out.println(attacks);
  }
}
