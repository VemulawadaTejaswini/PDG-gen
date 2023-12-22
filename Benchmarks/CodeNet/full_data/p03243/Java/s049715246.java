import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      int n;
      n=Integer.parseInt(sc.next());

      if(100<=n && n<=111){
        System.out.println(111);
      }else if(111<n && n<=222){
        System.out.println(222);
      }else if(222<n && n<=333){
        System.out.println(333);
      }else if(333<n && n<=444){
        System.out.println(444);
      }else if(444<n && n<=555){
        System.out.println(555);
      }else if(555<n && n<=666){
        System.out.println(666);
      }else if(666<n && n<=777){
        System.out.println(777);
      }else if(777<n && n<=888){
        System.out.println(888);
      }else if(888<n){
        System.out.println(999);
      }
      
      }catch (Exception e) {
      System.out.println("out");
    }
  }
}
