import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int x=sc.nextInt();
    System.out.println(1-Math.tan((double)a/(double)(b-a)));
  }
}