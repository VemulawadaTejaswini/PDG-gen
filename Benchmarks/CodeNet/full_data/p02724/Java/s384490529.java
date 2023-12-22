import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s =0;
    if(sc.hasNext())
    s= sc.nextInt();
    int points=0;
    points+=(s/500)*1000;
    points+=((s%500)/5)*5;
    System.out.println(points);
  }
}