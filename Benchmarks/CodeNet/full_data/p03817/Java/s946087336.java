import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long a = (x/11)*2;
    if (x%11>5) a+=2;
    else if (x%11>0) a+=1;
    System.out.println(a);
  }
}