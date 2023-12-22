import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  for(long i = N;;i--){
    if((long)Math.sqrt(i) * (long)Math.sqrt(i) == i){
      System.out.println(i);
      break;
    }
  }
}}
    