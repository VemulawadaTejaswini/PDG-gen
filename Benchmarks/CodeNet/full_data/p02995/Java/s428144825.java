import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long low = sc.nextLong();
    long high = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    int count = 0;
    for(int i = low;i <= high;i++){
      if((i % a != 0) && (i % b != 0)){
        count++;
      }
    }
    System.out.println(count);
  }
}