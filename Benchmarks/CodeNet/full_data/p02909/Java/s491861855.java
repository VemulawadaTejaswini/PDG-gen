import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    if(str=="Sunny"){
      System.out.println("Cloudy");
    }
    if(str=="Cloudy"){
      System.out.println("Rainy");
    }
    if(str=="Rainy"){
      System.out.println("Sunny");
    }
  }
}