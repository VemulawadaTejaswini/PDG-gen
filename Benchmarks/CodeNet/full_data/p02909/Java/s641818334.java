import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    if(S == "Sunny"){
      System.out.println("Cloudy");
    }elif(S == "Cloudy"){
      System.out.println("Rainy");
    }else{
      System.out.println("Sunny");
    }
  }
}
    